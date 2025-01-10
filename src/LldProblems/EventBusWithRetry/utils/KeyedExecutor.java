package LldProblems.EventBusWithRetry.utils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * List of threads -- [t1, t2, t3, t4]
 */
public class KeyedExecutor {

  private final Executor[] threadPool;

  public KeyedExecutor(final int threads) {
    threadPool = new Executor[threads]; // Empty list
    for (int i = 0; i < threads; i++) { 
      threadPool[i] = Executors.newSingleThreadExecutor(); // assign a single thread to each index.
    }
  }

  public CompletionStage<Void> submit(final String id, final Runnable task) {
    return CompletableFuture.runAsync(task, threadPool[id.hashCode() % threadPool.length]);
  }

  public <T> CompletionStage<T> get(final String id, final Supplier<T> task) {
    return CompletableFuture.supplyAsync(task, threadPool[id.hashCode() % threadPool.length]);
  }
}
