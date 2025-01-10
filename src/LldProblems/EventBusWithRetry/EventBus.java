package LldProblems.EventBusWithRetry;

import LldProblems.EventBusWithRetry.exceptions.RetryLimitExceededException;
import LldProblems.EventBusWithRetry.model.EntityId;
import LldProblems.EventBusWithRetry.model.Event;
import LldProblems.EventBusWithRetry.model.EventId;
import LldProblems.EventBusWithRetry.model.FailureEvent;
import LldProblems.EventBusWithRetry.model.Offset;
import LldProblems.EventBusWithRetry.model.Subscription;
import LldProblems.EventBusWithRetry.model.SubscriptionType;
import LldProblems.EventBusWithRetry.model.Timestamp;
import LldProblems.EventBusWithRetry.model.Topic;
import LldProblems.EventBusWithRetry.retry.RetryAlgorithm;
import LldProblems.EventBusWithRetry.utils.KeyedExecutor;
import LldProblems.EventBusWithRetry.utils.Timer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventBus {

  private final KeyedExecutor executor; // thread pool.
  private final Map<Topic, List<Event>> buses; // list of buses
  private final Map<Topic, Set<Subscription>> subscriptions;
  private final Map<Topic, Map<EntityId, Offset>> subscriberIndexes;
  private final Map<Topic, Map<EventId, Offset>> eventIndex;
  private final Map<Topic, ConcurrentSkipListMap<Timestamp, Offset>> timestampIndex;
  private final RetryAlgorithm<Event, Void> retryAlgorithm;
  private final EventBus deadLetterQueue;
  private final Timestamp timer;

  public EventBus(final int threads,
      final RetryAlgorithm<Event, Void> retryAlgorithm,
      final EventBus deadLetterQueue,
      final Timestamp timer) {
    this.retryAlgorithm = retryAlgorithm;
    this.deadLetterQueue = deadLetterQueue;
    this.timer = Timer.getTime();
    this.buses = new ConcurrentHashMap<>();
    this.executor = new KeyedExecutor(threads);
    this.subscriptions = new ConcurrentHashMap<>();
    this.subscriberIndexes = new ConcurrentHashMap<>();
    this.timestampIndex = new ConcurrentHashMap<>();
    this.eventIndex = new ConcurrentHashMap<>();
  }

  public CompletionStage<Void> publish(Topic topic, Event event) {
    return executor.submit(topic.getName(), () -> addEventToBus(topic, event));
  }

  private void addEventToBus(Topic topic, Event event) {
    final Offset currentIndex = new Offset(buses.get(topic).size());
    timestampIndex.get(topic).put(event.getTimestamp(), currentIndex);
    eventIndex.get(topic).put(event.getId(), currentIndex);
    buses.get(topic).add(event);
    subscriptions.getOrDefault(topic, Collections.newSetFromMap(new ConcurrentHashMap<>()))
        .stream()
        .filter(subscription -> SubscriptionType.PUSH.equals(subscription.getType()))
        .forEach(subscription -> push(event, subscription));
  }

  public CompletionStage<Event> poll(Topic topic, EntityId subscriber) {
    return executor.get(topic.getName() + subscriber.getId(), () -> {
      final Offset index = subscriberIndexes.get(topic).get(subscriber);
      try {
        final Event event = buses.get(topic).get(index.getVal());
        subscriberIndexes.get(topic).put(subscriber, index.increment());
        return event;
      } catch (IndexOutOfBoundsException exception) {
        return null;
      }
    });
  }

  private void push(Event event, Subscription subscription) {
    executor.submit(subscription.getTopicId().getName() + subscription.getSubscriberId(),
        () -> {
          try {
            retryAlgorithm.attempt(subscription.handler(), event, 0);
          } catch (RetryLimitExceededException e) {
            if (deadLetterQueue != null) {
              deadLetterQueue.publish(subscription.getTopicId(),
                  new FailureEvent(event, e, timer));
            } else {
              e.printStackTrace();
            }
          }
        });
  }

  public void registerTopic(Topic topic) {
    buses.put(topic, new CopyOnWriteArrayList<>());
    subscriptions.put(topic, Collections.newSetFromMap(new ConcurrentHashMap<>()));
    subscriberIndexes.put(topic, new ConcurrentHashMap<>());
    timestampIndex.put(topic, new ConcurrentSkipListMap<>());
    eventIndex.put(topic, new ConcurrentHashMap<>());
  }

  public CompletionStage<Void> subscribe(final Subscription subscription) {
    return executor.submit(subscription.getTopicId().getName(), () -> {
      final Topic topicId = subscription.getTopicId();
      subscriptions.get(topicId).add(subscription);
      subscriberIndexes.get(topicId).put(subscription.getSubscriberId(),
          new Offset(buses.get(topicId).size()));
    });
  }

  public CompletionStage<Void> setIndexAfterTimestamp(Topic topic, EntityId subscriber,
      Timestamp timestamp) {
    return executor.submit(topic.getName() + subscriber.getId(), () -> {
      final Map.Entry<Timestamp, Offset> entry = timestampIndex.get(topic).higherEntry(timestamp);
      if (entry == null) {
        subscriberIndexes.get(topic).put(subscriber, new Offset(buses.get(topic).size()));
      } else {
        final Offset indexLessThanEquals = entry.getValue();
        subscriberIndexes.get(topic).put(subscriber, indexLessThanEquals);
      }
    });
  }

  public CompletionStage<Void> setIndexAfterEvent(Topic topic, EntityId subscriber,
      EventId eventId) {
    return executor.submit(topic.getName() + subscriber.getId(), () -> {
      final Offset eIndex = eventIndex.get(topic).get(eventId);
      subscriberIndexes.get(topic).put(subscriber, eIndex.increment());
    });
  }

  public CompletionStage<Event> getEvent(Topic topic, EventId eventId) {
    return executor.get(topic.getName(), () -> {
      Offset index = eventIndex.get(topic).get(eventId);
      return buses.get(topic).get(index.getVal());
    });
  }
}
