package LldProblems.EventBus.model;

import LldProblems.EventBus.interfaces.ISubscriber;
import java.util.concurrent.atomic.AtomicInteger;

public class Subscriber {

  private final AtomicInteger offset; // single thread can only update this at a time.

  private final ISubscriber subscriber;

  public Subscriber(final ISubscriber subscriber) {
    this.subscriber = subscriber;
    this.offset = new AtomicInteger(0);
  }

  public AtomicInteger getOffset() {
    return offset;
  }

  public ISubscriber getSubscriber() {
    return subscriber;
  }
}
