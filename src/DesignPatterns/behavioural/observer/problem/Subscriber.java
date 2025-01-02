package DesignPatterns.behavioural.observer.problem;

/**
 * Observer
 */
public class Subscriber {

  private final String name;

  public Subscriber(String name) {
    this.name = name;
  }

  public void notify(String message) {
    System.out.println(String.format("Hi %s, %s", this.name, message));
  }
}
