package LldProblems.EventBusWithRetry;

import LldProblems.EventBusWithRetry.model.EntityId;
import LldProblems.EventBusWithRetry.model.Event;
import LldProblems.EventBusWithRetry.model.EventId;
import LldProblems.EventBusWithRetry.model.Subscription;
import LldProblems.EventBusWithRetry.model.SubscriptionType;
import LldProblems.EventBusWithRetry.model.Timestamp;
import LldProblems.EventBusWithRetry.model.Topic;
import LldProblems.EventBusWithRetry.retry.PeriodicRetry;
import LldProblems.EventBusWithRetry.utils.Timer;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Main {

  public static final Topic TOPIC_1 = new Topic("topic-1");
  private static java.lang.Void Void;

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    final Timestamp timer = Timer.getTime();
    EventBus eventBus = new EventBus(1,
        new PeriodicRetry<>(5, 1000), null, timer);
    final EventId eventId1 = new EventId("event-id-1");
    eventBus.registerTopic(TOPIC_1);
    eventBus.publish(TOPIC_1, getEvent(timer, eventId1));
    final EntityId subscriberId = new EntityId("subscriber-1");
    eventBus.subscribe(new Subscription(TOPIC_1, subscriberId, SubscriptionType.PUSH,
        (event) -> true, (event) -> printData(event)));
    // final Event event = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();

    final EventId eventId2 = new EventId("event-id-2");
    eventBus.publish(TOPIC_1, getEvent(timer, eventId2));
    final EntityId subscriberId2 = new EntityId("subscriber-2");
    eventBus.subscribe(new Subscription(TOPIC_1, subscriberId2, SubscriptionType.PULL,
        (event) -> true, (event) -> printData(event)));
    // final Event event2 = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    // System.out.println(event2);

    // testforIndexAfter(timer);
  }

  private static Void printData(Event event) {
    System.out.println(event.toString());
    return Void;
  }

  private static void testforIndexAfter(Timestamp timer)
      throws ExecutionException, InterruptedException {
    EventBus eventBus = new EventBus(1,
        new PeriodicRetry<>(5, 1000), null, timer);
    final EventId eventId1 = new EventId("event-id-1"),
        eventId2 = new EventId("event-id-2"),
        eventId3 = new EventId("event-id-3"),
        eventId4 = new EventId("event-id-4");
    eventBus.registerTopic(TOPIC_1);
    final Event event1 = getEvent(timer, eventId1);
    eventBus.publish(TOPIC_1, event1);
    eventBus.publish(TOPIC_1, getEvent(timer, eventId2));
    eventBus.publish(TOPIC_1, getEvent(timer, eventId3));
    eventBus.publish(TOPIC_1, getEvent(timer, eventId4));
    final EntityId subscriberId = new EntityId("subscriber-1");
    eventBus.subscribe(new Subscription(TOPIC_1, subscriberId, SubscriptionType.PULL,
        (event) -> true, (event) -> null));
    final Event event = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    eventBus.setIndexAfterEvent(TOPIC_1, subscriberId, eventId2);

    Event resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();

    System.out.println(resetEventPolled.toString());
    System.out.println(eventId3.equals(resetEventPolled.getId()));
    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    System.out.println(resetEventPolled.toString());
    System.out.println(eventId4.equals(resetEventPolled.getId()));
    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();

    eventBus.setIndexAfterTimestamp(TOPIC_1, subscriberId, event1.getTimestamp());

    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    System.out.println(resetEventPolled.toString());
    System.out.println(eventId2.equals(resetEventPolled.getId()));
    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    System.out.println(resetEventPolled.toString());
    System.out.println(eventId3.equals(resetEventPolled.getId()));
    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
    System.out.println(resetEventPolled.toString());
    System.out.println(eventId4.equals(resetEventPolled.getId()));
    resetEventPolled = eventBus.poll(TOPIC_1, subscriberId).toCompletableFuture().get();
  }

  private static Event getEvent(Timestamp time, EventId eventId1) {
    return new Event(eventId1, "event-name-1", new HashMap<>(), time);
  }
}
