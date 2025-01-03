package DesignPatterns.behavioural.strategy.solution;

public class HeavyLoadVehicle extends Vehicle {

  public HeavyLoadVehicle() {
    super(new HeavyDrive());
  }
}
