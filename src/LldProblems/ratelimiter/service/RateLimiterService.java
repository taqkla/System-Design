package LldProblems.ratelimiter.service;

import LldProblems.ratelimiter.model.Configuration;
import LldProblems.ratelimiter.service.common.RateLimitingAlgorithm;
import LldProblems.ratelimiter.service.factory.RateLimitingFactory;
import LldProblems.ratelimiter.service.strategy.RateLimitingStrategy;
import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {


  private static RateLimiterService rateLimiterService;
  private final Map<Configuration, RateLimitingStrategy> rateLimiterMap = new HashMap<>();

  private RateLimiterService(Configuration configuration, RateLimitingAlgorithm type) {
    rateLimiterMap.put(configuration, RateLimitingFactory.getInstance(type, configuration));
  }

  public synchronized static RateLimiterService getInstance(Configuration configuration,
      RateLimitingAlgorithm type) {
    if (rateLimiterService == null) {
      rateLimiterService = new RateLimiterService(configuration, type);
    }
    return rateLimiterService;
  }

  boolean accessApplication(Configuration configuration) {
    if (rateLimiterMap.get(configuration).grantAccess()) {
      System.out.println(Thread.currentThread().getName() + " -> able to access the application");
      return true;
    } else {
      System.out.println(
          Thread.currentThread().getName() + " -> Too many request, Please try after some time");
      return false;
    }
  }
}
