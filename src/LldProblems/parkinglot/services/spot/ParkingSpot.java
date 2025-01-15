package LldProblems.parkinglot.services.spot;

import LldProblems.parkinglot.entities.Vehicle;

public class ParkingSpot {

  private String spotId;
  private ParkingSpotType parkingType;
  private Vehicle vehicle;
  boolean isEmpty;

  public ParkingSpot(String spotId, ParkingSpotType type) {
    this.spotId = spotId;
    this.parkingType = type;
    this.isEmpty = true;
  }

  public String getSpotId() {
    return spotId;
  }

  public ParkingSpotType getParkingType() {
    return parkingType;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public boolean isEmpty() {
    return isEmpty;
  }

  public void parkVehicle(Vehicle v) {
    isEmpty = false;
    vehicle = v;
  }

  public void removeVehicle() {
    vehicle = null;
    isEmpty = true;
  }
}
