package LldProblems.EventBus;

import LldProblems.EventBus.interfaces.Bus;
import LldProblems.EventBus.model.Message;
import LldProblems.EventBus.model.Topic;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    final Bus Bus = new Bus();
    final Topic topic1 = Bus.createTopic("t1");
    final Topic topic2 = Bus.createTopic("t2");
    final SleepingSubscriber sub1 = new SleepingSubscriber("sub1", 10000);
    final SleepingSubscriber sub2 = new SleepingSubscriber("sub2", 10000);
    Bus.subscribe(sub1, topic1);
    Bus.subscribe(sub2, topic1);

    final SleepingSubscriber sub3 = new SleepingSubscriber("sub3", 5000);
    Bus.subscribe(sub3, topic2);

    Bus.publish(topic1, new Message("m1"));
    Bus.publish(topic1, new Message("m2"));

    Bus.publish(topic2, new Message("m3"));

    Thread.sleep(15000);
    Bus.publish(topic2, new Message("m4"));
    Bus.publish(topic1, new Message("m5"));

    Bus.resetOffset(topic1, sub1, 0);
  }
}
