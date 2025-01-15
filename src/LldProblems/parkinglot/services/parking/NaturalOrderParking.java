package LldProblems.parkinglot.services.parking;

import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.util.List;

public class NaturalOrderParking extends ParkingStrategy {

  @Override
  public ParkingSpot park(List<ParkingSpot> availableSpaces) {
    return availableSpaces.get(0);
  }
}
