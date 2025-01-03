package DesignPatterns.behavioural.strategy.solution;

public class LongRoadVehicle extends Vehicle {

  public LongRoadVehicle() {
    super(new HeavyDrive());
  }
}
