package LldProblems.EventBus.handler;

import LldProblems.EventBus.model.Subscriber;
import LldProblems.EventBus.model.Topic;
import java.util.HashMap;
import java.util.Map;

public class TopicHandler {

  private final Topic topic;
  private final Map<String /*subscriptionID*/, SubscriberWorker> subscriberWorkers;

  public TopicHandler(final Topic topic) {
    this.topic = topic;
    subscriberWorkers = new HashMap<>();
  }

  public void publish() {
    for (Subscriber Subscriber : topic.getSubscribers()) {
      startSubscriberWorker(Subscriber); // start async worker to consume the message
    }
  }

  public void startSubscriberWorker(final Subscriber Subscriber) {
    final String subscriberId = Subscriber.getSubscriber().getId();
    if (!subscriberWorkers.containsKey(subscriberId)) {
      final SubscriberWorker subscriberWorker = new SubscriberWorker(topic, Subscriber);
      subscriberWorkers.put(subscriberId, subscriberWorker);
      new Thread(subscriberWorker).start();
    }
    final SubscriberWorker subscriberWorker = subscriberWorkers.get(subscriberId);
    subscriberWorker.wakeUpIfNeeded();
  }
}
