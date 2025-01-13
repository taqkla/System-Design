package LldProblems.ratelimiter.service;

import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.service.common.RateLimitingAlgorithm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

  public static void main(String[] args) {
    Configuration config = new Configuration(10, "User-service", 1);
    // Configuration config1 = new Configuration(10, "User-service", 2);
    RateLimiterService rateLimiterService = RateLimiterService.getInstance(config,
        RateLimitingAlgorithm.TOKEN_BUCKET);
    // rateLimiterService = RateLimiterService.getInstance(config1,
    //     RateLimitingAlgorithm.TOKEN_BUCKET);
    ExecutorService executors = Executors.newFixedThreadPool(12);
    for (int i = 0; i < 11; i++) {
      RateLimiterService finalRateLimiterService = rateLimiterService;
      executors.execute(() -> finalRateLimiterService.accessApplication(config));

    }
    executors.shutdown();
  }
}
