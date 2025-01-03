package DesignPatterns.behavioural.strategy.solution;

public class NormalDrive implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("Normal Drive Capability");
  }
}
