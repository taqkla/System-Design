package LldProblems.EventBusWithRetry.retry;

import com.google.inject.Inject;
import com.google.inject.name.Named;
public class PeriodicRetry<P, R> extends RetryAlgorithm<P, R> {

  @Inject
  public PeriodicRetry(@Named("periodic-retry-attempts") final int maxAttempts,
      @Named("periodic-retry-wait") final long waitTimeInMillis) {
    super(maxAttempts, (__) -> waitTimeInMillis);
  }
}
