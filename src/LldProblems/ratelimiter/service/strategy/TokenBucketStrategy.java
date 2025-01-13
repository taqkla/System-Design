package LldProblems.ratelimiter.service.strategy;

import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.model.Data;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketStrategy implements RateLimitingStrategy {


  private final Configuration configuration;
  private int refreshRate;
  private AtomicInteger currentCapacity;
  public final BlockingQueue<Data> queue;

  public TokenBucketStrategy(Configuration configuration, int refreshRate) {
    this.configuration = configuration;
    this.refreshRate = refreshRate;
    this.currentCapacity = new AtomicInteger(configuration.getCapacity());
    this.lastUpdatedTime = new AtomicLong(System.currentTimeMillis());
    this.queue = new LinkedBlockingQueue<Data>(configuration.getCapacity());
  }

  private AtomicLong lastUpdatedTime;

  @Override
  public boolean grantAccess() {
    refreshBucket();
    if (currentCapacity.get() > 0) {
      currentCapacity.decrementAndGet();
      return true;
    }
    return false;

  }

  void refreshBucket() {
    long currentTime = System.currentTimeMillis();
    int additionalToken = (int) ((currentTime - lastUpdatedTime.get()) / 1000 * refreshRate);
    int currCapacity = Math.min(currentCapacity.get() + additionalToken,
        configuration.getCapacity());
    currentCapacity.getAndSet(currCapacity);
    lastUpdatedTime.getAndSet(currentTime);
  }
}
