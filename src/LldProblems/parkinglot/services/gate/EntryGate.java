package LldProblems.parkinglot.services.gate;

import LldProblems.parkinglot.entities.Ticket;
import LldProblems.parkinglot.entities.Vehicle;
import LldProblems.parkinglot.services.ParkingLot;
import LldProblems.parkinglot.services.spot.ParkingSpot;

public class EntryGate {

  private String gateId;

  public EntryGate(String gateId) {
    this.gateId = gateId;
  }

  public String getGateId() {
    return gateId;
  }

  public Ticket generateTicket(Vehicle v) {
    if (!ParkingLot.INSTANCE.isParkingSpaceAvailable(v.getVehicleType())) {
      return null;
    }

    ParkingSpot parkingSpot = ParkingLot.INSTANCE.findParkingSpot(v);
    parkingSpot.parkVehicle(v);
    System.out.println("Are we coming here: " + parkingSpot.getSpotId());
    return new Ticket(v, parkingSpot);
  }
}
