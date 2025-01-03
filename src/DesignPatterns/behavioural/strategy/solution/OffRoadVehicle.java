package DesignPatterns.behavioural.strategy.solution;

public class OffRoadVehicle extends Vehicle {


  public OffRoadVehicle() {
    super(new HeavyDrive());
  }
}
