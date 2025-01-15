package LldProblems.parkinglot.services.parking;

import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.util.List;

public class VipParkingStrategy extends ParkingStrategy {

  @Override
  public ParkingSpot park(List<ParkingSpot> availableSpaces) {
// provide priority .....
    return availableSpaces.stream().findAny().get();

  }
}
