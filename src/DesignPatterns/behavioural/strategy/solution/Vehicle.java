package DesignPatterns.behavioural.strategy.solution;

public class Vehicle {

  DriveStrategy driveStrategy;

  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    this.driveStrategy.drive();
  }

  public void setDriveStrategy(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

}
