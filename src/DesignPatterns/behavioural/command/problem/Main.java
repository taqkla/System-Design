package DesignPatterns.behavioural.command.problem;

/**
 * The Command Design Pattern is a behavioral design pattern that encapsulates a request as
 * an object, thereby allowing for the parameterization of clients with queues, requests, and
 * operations. This pattern decouples the sender of a request from the object that executes the
 * request, allowing for more flexible and dynamic command handling.
 */
public class Main {

  public static void main(String[] args) {
    AirConditioner ac = new AirConditioner();
    Bulb bulb = new Bulb();

    ac.turnOnAC(); // command
    ac.turnOffAC(); // another command -- client need to understand the undo functionality.

    ac.setTemperature(18);
    ac.turnOffAC();
  }

}
