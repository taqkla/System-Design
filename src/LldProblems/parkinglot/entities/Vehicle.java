package LldProblems.parkinglot.entities;

public abstract class Vehicle {

  private String regNum;
  private VehicleType vehicleType;


  public Vehicle(String regNum, VehicleType vType) {
    this.regNum = regNum;
    this.vehicleType = vType;
  }

  public String getRegNum() {
    return regNum;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }
}
