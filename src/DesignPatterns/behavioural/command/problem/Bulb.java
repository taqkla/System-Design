package DesignPatterns.behavioural.command.problem;

public class Bulb {

  private boolean isOn;


  public void turnOnBulb() {
    isOn = true;
    System.out.println("Bulb is on!");
  }

  public void turnOffBulb() {
    isOn = false;
    System.out.println("Bulb is off!");
  }

}
