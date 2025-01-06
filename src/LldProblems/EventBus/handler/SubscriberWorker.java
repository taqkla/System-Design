package LldProblems.EventBus.handler;

import LldProblems.EventBus.model.Message;
import LldProblems.EventBus.model.Subscriber;
import LldProblems.EventBus.model.Topic;

public class SubscriberWorker implements Runnable {

  private final Topic topic;
  private final Subscriber Subscriber;

  public SubscriberWorker(final Topic topic, final Subscriber Subscriber) {
    this.topic = topic;
    this.Subscriber = Subscriber;
  }

  @Override
  public void run() {
    synchronized (Subscriber) {
      do {
        int curOffset = Subscriber.getOffset().get();
        while (curOffset >= topic.getMessages().size()) {
          try {
            Subscriber.wait();
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
        Message message = topic.getMessages().get(curOffset);
        try {
          Subscriber.getSubscriber().consume(message);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        // We cannot just increment here since subscriber offset can be reset while it is consuming. So, after
        // consuming we need to increase only if it was previous one.
        Subscriber.getOffset().compareAndSet(curOffset, curOffset + 1);
      } while (true);
    }
  }

  synchronized public void wakeUpIfNeeded() {
    synchronized (Subscriber) {
      Subscriber.notify();
    }
  }
}
