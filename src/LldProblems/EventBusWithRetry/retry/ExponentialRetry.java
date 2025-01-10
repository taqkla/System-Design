package LldProblems.EventBusWithRetry.retry;

import java.util.function.Function;

public class ExponentialRetry<P, R> extends RetryAlgorithm<P, R>  {

  public ExponentialRetry(int maxAttempts,
      Function<Integer, Long> retryTimeCalculator) {
    super(maxAttempts, retryTimeCalculator);
  }
}
