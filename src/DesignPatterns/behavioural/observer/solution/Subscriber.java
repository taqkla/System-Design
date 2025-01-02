package DesignPatterns.behavioural.observer.solution;

/**
 * Observer
 */
public class Subscriber {

  private final String name;

  public Subscriber(String name) {
    this.name = name;
  }

  public void notified(String message) {
    System.out.println(String.format("Hi %s, %s", this.name, message));
  }
}
