package DesignPatterns.behavioural.strategy.problem;

public class HeavyLoadVehicle extends Vehicle {

  @Override
  public void drive() {
    // big algorithm
    System.out.println("Heavy Drive Capability");
  }
}
