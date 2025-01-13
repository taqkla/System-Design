package LldProblems.ratelimiter.service.factory;

import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.service.common.RateLimitingAlgorithm;
import LldProblems.ratelimiter.service.strategy.LeakyBucketStrategy;
import LldProblems.ratelimiter.service.strategy.RateLimitingStrategy;
import LldProblems.ratelimiter.service.strategy.SlidingWindowStrategy;
import LldProblems.ratelimiter.service.strategy.TokenBucketStrategy;

public class RateLimitingFactory {

  public static RateLimitingStrategy getInstance(RateLimitingAlgorithm algorithm,
      Configuration config) {
    switch (algorithm) {
      case TOKEN_BUCKET: {
        return new TokenBucketStrategy(config, 10);
      }
      case SLIDING_WINDOW: {
        return new SlidingWindowStrategy(config, 1);
      }
      default: {
        return new LeakyBucketStrategy(config);
      }
    }
  }

}
