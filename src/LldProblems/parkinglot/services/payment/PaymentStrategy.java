package LldProblems.parkinglot.services.payment;

import LldProblems.parkinglot.entities.Vehicle;
import LldProblems.parkinglot.entities.Ticket;



public abstract class PaymentStrategy {

  private double twoWheelerCharges;
  private double fourWheelerCharges;
  private double heavyVehicleCharges;
  private double handicappedVehicleCharges;

  public double getTwoWheelerCharges() {
    return twoWheelerCharges;
  }

  public void setTwoWheelerCharges(double twoWheelerCharges) {
    this.twoWheelerCharges = twoWheelerCharges;
  }

  public double getFourWheelerCharges() {
    return fourWheelerCharges;
  }

  public void setFourWheelerCharges(double fourWheelerCharges) {
    this.fourWheelerCharges = fourWheelerCharges;
  }

  public double getHeavyVehicleCharges() {
    return heavyVehicleCharges;
  }

  public void setHeavyVehicleCharges(double heavyVehicleCharges) {
    this.heavyVehicleCharges = heavyVehicleCharges;
  }

  public double getHandicappedVehicleCharges() {
    return handicappedVehicleCharges;
  }

  public void setHandicappedVehicleCharges(double handicappedVehicleCharges) {
    this.handicappedVehicleCharges = handicappedVehicleCharges;
  }

  public abstract double calculateCost(Ticket t);

  protected double getChargeType(Vehicle v) {
    switch (v.getVehicleType()) {
      case FOUR_WHEELER:
        return fourWheelerCharges;
      case TWO_WHEELER:
        return twoWheelerCharges;
      case HEAVY:
        return heavyVehicleCharges;
      case HANDICAPPED:
        return handicappedVehicleCharges;

    }

    return 0;
  }
}
