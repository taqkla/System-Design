package LldProblems.EventBusWithRetry.retry;

import LldProblems.EventBusWithRetry.exceptions.RetryAbleException;
import LldProblems.EventBusWithRetry.exceptions.RetryLimitExceededException;
import java.util.function.Function;

public abstract class RetryAlgorithm<PARAMETER, RESULT> {

  private final int maxAttempts;
  private final Function<Integer, Long> retryTimeCalculator;

  public RetryAlgorithm(final int maxAttempts,
      final Function<Integer, Long> retryTimeCalculator) {
    this.maxAttempts = maxAttempts;
    this.retryTimeCalculator = retryTimeCalculator;
  }

  public RESULT attempt(Function<PARAMETER, RESULT> task, PARAMETER parameter, int attempts) {
    try {
      // Execute the consume method
      return task.apply(parameter);
    } catch (Exception e) {
      // if the exception occurs, check if it's retryable error
      if (e.getCause() instanceof RetryAbleException) {
        // check if max attempts are exausted
        if (attempts == maxAttempts) {
          throw new RetryLimitExceededException();
        } else {

          // attempt the execution of task once again.
          final RESULT result = attempt(task, parameter, attempts + 1);
          try {
            Thread.sleep(retryTimeCalculator.apply(attempts));
            return result;
          } catch (InterruptedException interrupt) {
            throw new RuntimeException(interrupt);
          }
        }
      } else {
        throw new RuntimeException(e);
      }
    }
  }
}
