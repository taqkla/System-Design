package DesignPatterns.behavioural.command.problem;

/**
 * The Command Method Design Pattern is a behavioral design pattern that encapsulates a request as
 * an object, thereby allowing for the parameterization of clients with queues, requests, and
 * operations. This pattern decouples the sender of a request from the object that executes the
 * request, allowing for more flexible and dynamic command handling.
 */
public class Main {

  public static void main(String[] args) {
    AirConditioner ac = new AirConditioner();

    ac.turnOnAC();
    ac.setTemperature(18);
    ac.turnOffAC();
  }

}
