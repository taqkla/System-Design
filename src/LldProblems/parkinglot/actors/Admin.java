package LldProblems.parkinglot.actors;

import LldProblems.parkinglot.services.gate.EntryGate;
import LldProblems.parkinglot.services.gate.ExitGate;
import LldProblems.parkinglot.services.Floor;
import LldProblems.parkinglot.services.ParkingLot;
import LldProblems.parkinglot.services.spot.ParkingSpot;
import LldProblems.parkinglot.services.parking.ParkingStrategy;
import java.util.UUID;

public class Admin {

  private final String id;
  private LoginInfo login;
  private ContactInfo contact;

  public Admin() {
    id = UUID.randomUUID().toString();

  }


  public void setParkingStrategy(ParkingStrategy pStrategy) {
    ParkingLot.INSTANCE.setParkingStrategy(pStrategy);
  }

  public void addFloor(Floor f) {
    ParkingLot.INSTANCE.getFloorList().add(f);

  }

  public void addParkingSpot(Floor f, ParkingSpot p) {
    f.addParkingSpot(p);


  }

  public void addEntryGate(EntryGate entry) {
    ParkingLot.INSTANCE.getEntries().add(entry);
  }

  public void addExitGate(ExitGate exit) {
    ParkingLot.INSTANCE.getExits().add(exit);
  }
}
