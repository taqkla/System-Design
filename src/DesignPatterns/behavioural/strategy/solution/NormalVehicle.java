package DesignPatterns.behavioural.strategy.solution;

public class NormalVehicle extends Vehicle {

  public NormalVehicle() {
    super(new NormalDrive());
  }
}
