package DesignPatterns.behavioural.command.solution;

public class CoffeeMachine {

  boolean isOn;

  public void turnOnCoffeeMachine() {
    isOn = true;
    System.out.println("Machine is on!");
  }

  public void turnOffCoffeeMachine() {
    isOn = false;
    System.out.println("Machine is off!");
  }
}
