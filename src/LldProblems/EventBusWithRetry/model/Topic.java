package LldProblems.EventBusWithRetry.model;

public class Topic {

  private final String name;

  public Topic(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
