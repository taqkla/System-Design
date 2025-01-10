package LldProblems.EventBusWithRetry.utils;

import LldProblems.EventBusWithRetry.model.Timestamp;

public class Timer {

  private Timer() {

  }

  public static Timestamp getTime() {
    return new Timestamp(System.nanoTime());
  }
}