package DesignPatterns.behavioural.strategy.solution;

public class LongRoadVehicle extends Vehicle {

  private DriveStrategy driveStrategy;
  public LongRoadVehicle(DriveStrategy driveStrategy) {
    super(driveStrategy);
  }
}
