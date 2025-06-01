package DesignPatterns.behavioural.strategy.solution;

public class HeavyDrive implements DriveStrategy {

  @Override
  public void drive() {
    // big algorithm
    System.out.println("Heavy Drive Capability");
  }
}
