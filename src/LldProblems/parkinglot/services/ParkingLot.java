package LldProblems.parkinglot.services;

import DesignPatterns.creational.builder.solution.Address;
import LldProblems.parkinglot.entities.Vehicle;
import LldProblems.parkinglot.entities.VehicleType;
import LldProblems.parkinglot.services.gate.EntryGate;
import LldProblems.parkinglot.services.gate.ExitGate;
import LldProblems.parkinglot.services.parking.ParkingStrategy;
import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLot {

  private String parkingLotId;
  private List<Floor> floorList;
  private List<EntryGate> entries;
  private List<ExitGate> exits;
  private Address address;
  private ParkingStrategy parkingStrategy;

  public String getParkingLotId() {
    return parkingLotId;
  }

  public List<Floor> getFloorList() {
    return floorList;
  }

  public List<EntryGate> getEntries() {
    return entries;
  }

  public List<ExitGate> getExits() {
    return exits;
  }

  public Address getAddress() {
    return address;
  }

  public ParkingStrategy getParkingStrategy() {
    return parkingStrategy;
  }

  public void setParkingLotId(String parkingLotId) {
    this.parkingLotId = parkingLotId;
  }

  public void setFloorList(List<Floor> floorList) {
    this.floorList = floorList;
  }

  public void setEntries(List<EntryGate> entries) {
    this.entries = entries;
  }

  public void setExits(List<ExitGate> exits) {
    this.exits = exits;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setParkingStrategy(ParkingStrategy parkingStrategy) {
    this.parkingStrategy = parkingStrategy;
  }

  public static ParkingLot INSTANCE = new ParkingLot();

  private ParkingLot() {
    parkingLotId = UUID.randomUUID().toString();
    floorList = new ArrayList<>();
    entries = new ArrayList<>();
    exits = new ArrayList<>();
  }

  public boolean isParkingSpaceAvailable(VehicleType vType) {
    for (Floor floor : floorList) {
      return floor.canParkVehicle(vType);
    }
    return false;
  }

  public ParkingSpot findParkingSpot(Vehicle v) {
    for (Floor floor : floorList) {
      return floor.getSpot(v);
    }
    return null;
  }
}
