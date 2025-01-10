package LldProblems.EventBusWithRetry.model;

public class EventId {

  private final String id;

  public EventId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return id;
  }
}
