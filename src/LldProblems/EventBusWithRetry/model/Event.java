package LldProblems.EventBusWithRetry.model;

import java.util.Map;

/**
 * Message  -
 */
public class Event {

  private final EventId id;
  private final String name;
  private final Map<String, String> attributes; // String msg;
  private final Timestamp timestamp;

  public Event(EventId id, String name, Map<String, String> attributes, Timestamp timestamp) {
    this.id = id;
    this.name = name;
    this.attributes = attributes;
    this.timestamp = timestamp;
  }

  public EventId getId() {
    return id;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public String getName() {
    return name;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Event{" +
        "id=" + id +
        '}';
  }
}
