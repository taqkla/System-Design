package LldProblems.EventBus.interfaces;

import LldProblems.EventBus.handler.TopicHandler;
import LldProblems.EventBus.model.Message;
import LldProblems.EventBus.model.Subscriber;
import LldProblems.EventBus.model.Topic;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bus {

  private final Map<String, TopicHandler> topicProcessors;

  public Bus() {
    this.topicProcessors = new HashMap<>();
  }

  public Topic createTopic(final String topicName) {
    final Topic topic = new Topic(topicName, UUID.randomUUID().toString());
    TopicHandler topicHandler = new TopicHandler(topic);
    topicProcessors.put(topic.getTopicId(), topicHandler);
    System.out.println("Created topic: " + topic.getTopicName());
    return topic;
  }

  public void subscribe(final ISubscriber subscriber, final Topic topic) {
    topic.addSubscriber(new Subscriber(subscriber));
    System.out.println(subscriber.getId() + " subscribed to topic: " + topic.getTopicName());
  }

  public void publish(final Topic topic, final Message message) {
    topic.addMessage(message);
    System.out.println(message.getMsg() + " published to topic: " + topic.getTopicName());
    new Thread(() -> topicProcessors.get(topic.getTopicId()).publish()).start();
  }

  public void resetOffset(final Topic topic, final ISubscriber subscriber,
      final Integer newOffset) {
    for (Subscriber Subscriber : topic.getSubscribers()) {
      if (Subscriber.getSubscriber().equals(subscriber)) {
        Subscriber.getOffset().set(newOffset);
        System.out.println(
            Subscriber.getSubscriber().getId() + " offset reset to: " + newOffset);
        new Thread(() -> topicProcessors.get(topic.getTopicId())
            .startSubscriberWorker(Subscriber)).start();
        break;
      }
    }
  }
}
