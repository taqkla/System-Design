package DesignPatterns.behavioural.strategy.solution;

/**
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of
 * them into a separate class, and make their objects interchangeable.
 */
public class Main {

  public static void main(String[] args) {

    Vehicle longRoadVehicle = new LongRoadVehicle(new HeavyDrive());
    longRoadVehicle.drive();
    longRoadVehicle.setDriveStrategy(new NormalDrive());
    longRoadVehicle.drive();

  }

}
