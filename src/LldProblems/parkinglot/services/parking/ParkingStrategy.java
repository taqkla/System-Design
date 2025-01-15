package LldProblems.parkinglot.services.parking;

import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.util.List;

public abstract class ParkingStrategy {

  public abstract ParkingSpot park(List<ParkingSpot> availableSpaces);
}
