package LldProblems.ratelimiter.model;

import LldProblems.EventBusWithRetry.model.Timestamp;

public class Data {

  private final String message;
  private final Timestamp timestamp;

  public Data(String message, Timestamp timestamp) {
    this.message = message;
    this.timestamp = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }
}
