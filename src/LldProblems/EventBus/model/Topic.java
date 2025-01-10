package LldProblems.EventBus.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {

  private final String topicName;
  private final String topicId;
  private final List<Message> messages; // TODO: Change getter this to send only immutable list outside.
  private final List<Subscriber> subscribers; // TODO: Change getter this to send only immutable list outside.


  private Topic(final String topicName, final String topicId) {
    this.topicName = topicName;
    this.topicId = topicId;
    this.messages = new ArrayList<>();
    this.subscribers = new ArrayList<>();
  }

  public static Topic createTopic(final String topicName, final String topicId) {
    return new Topic(topicName, topicId);
  }

  public String getTopicName() {
    return topicName;
  }

  public String getTopicId() {
    return topicId;
  }

  public List<Message> getMessages() {
    return messages;
  }

  public List<Subscriber> getSubscribers() {
    return subscribers;
  }

  public synchronized void addMessage(final Message message) {
    messages.add(message);
  }

  public void addSubscriber(final Subscriber subscriber) {
    subscribers.add(subscriber);
  }
}
