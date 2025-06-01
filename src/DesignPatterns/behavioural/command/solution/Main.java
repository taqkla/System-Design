package DesignPatterns.behavioural.command.solution;

/**
 * How does it solve the problem? 1. Separates the logic in Receiver, Invoker and Command.
 */
public class Main {

  public static void main(String[] args) {
    //  Receiver - Actual Implementation
    AirConditioner ac = new AirConditioner();
    Bulb bulb = new Bulb();

    // Invoker - Client
    RemoteControl remote = new RemoteControl();

    // Command - set of commands.
    remote.setCommand(new TurnOnAc(ac));
    remote.pressButton();
    remote.setCommand(new TurnOnBulb(bulb));
    remote.pressButton();

    remote.undo();
    remote.undo();
  }

}
