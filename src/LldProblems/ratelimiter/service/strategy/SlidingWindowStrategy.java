package LldProblems.ratelimiter.service.strategy;

import LldProblems.EventBusWithRetry.model.Timestamp;
import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.model.Data;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindowStrategy implements RateLimitingStrategy {

  public final ConcurrentLinkedQueue<Data> queue;
  private final int timeWindowInSeconds;
  private final Configuration configuration;

  public SlidingWindowStrategy(Configuration configuration, int timeWindowInSeconds) {
    this.configuration = configuration;
    this.timeWindowInSeconds = timeWindowInSeconds;
    this.queue = new ConcurrentLinkedQueue<Data>();
  }

  @Override
  public boolean grantAccess() {
    long currentTime = System.currentTimeMillis();
    checkAndUpdateQueue(new Timestamp(currentTime));
    if (queue.size() < configuration.getCapacity()) {
      queue.offer(new Data(configuration.getService(), new Timestamp(1234)));
      return true;
    }
    return false;
  }

  private void checkAndUpdateQueue(Timestamp currentTime) {
    if (queue.isEmpty()) {
      return;
    }

    long calculatedTime = (currentTime.compareTo(queue.peek().getTimestamp())) / 1000;
    while (calculatedTime >= timeWindowInSeconds) {
      queue.poll();
      if (queue.isEmpty()) {
        break;
      }
      calculatedTime = (currentTime.compareTo(queue.peek().getTimestamp())) / 1000;
    }
  }
}
