package LldProblems.EventBusWithRetry.retry;

public class PeriodicRetry<P, R> extends RetryAlgorithm<P, R> {

  public PeriodicRetry(final int maxAttempts, final long waitTimeInMillis) {
    super(maxAttempts, (__) -> waitTimeInMillis);
  }
}
