package LldProblems.ratelimiter.service.strategy;

import LldProblems.EventBusWithRetry.model.Timestamp;
import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.model.Data;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Use abstract class whenever you can think of multiple inheritence.
 */
public class LeakyBucketStrategy implements RateLimitingStrategy {

  public final Configuration configuration;
  public final BlockingQueue<Data> queue;

  public LeakyBucketStrategy(Configuration configuration) {
    this.configuration = configuration;
    this.queue = new LinkedBlockingQueue<Data>(configuration.getCapacity());
  }

  @Override
  public boolean grantAccess() {

    // Entire algorithm can be written here.
    if (this.queue.remainingCapacity() > 0) {
      Data data = new Data(this.configuration.getService(), new Timestamp(123423));
      this.queue.add(data);
      return true;
    }
    return false;
  }
}
