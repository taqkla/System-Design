package LldProblems.parkinglot.services;

import LldProblems.parkinglot.entities.Vehicle;
import LldProblems.parkinglot.entities.VehicleType;
import LldProblems.parkinglot.services.spot.ParkingSpot;
import LldProblems.parkinglot.services.spot.ParkingSpotType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {

  private final String floorId;
  private Map<ParkingSpotType, List<ParkingSpot>> parkingSpots = new HashMap<>();

  public Floor(String floorId) {
    this.floorId = floorId;
    parkingSpots.put(ParkingSpotType.TWO_WHEELER_PARKING, new ArrayList<>());
    parkingSpots.put(ParkingSpotType.FOUR_WHEELER_PARKING, new ArrayList<>());
    parkingSpots.put(ParkingSpotType.HEAVY_PARKING, new ArrayList<>());
    parkingSpots.put(ParkingSpotType.HANDICAPPED_PARKING, new ArrayList<>());

  }

  public String getFloorId() {
    return floorId;
  }

  public Map<ParkingSpotType, List<ParkingSpot>> getParkingSpots() {
    return parkingSpots;
  }


  public void addParkingSpot(ParkingSpot p) {
    parkingSpots.get(p.getParkingType()).add(p);
  }

  public void removeParkingSpot(ParkingSpot p) {
    parkingSpots.get(p.getParkingType()).remove(p);
  }

  public boolean canParkVehicle(VehicleType vType) {
    for (ParkingSpot p : parkingSpots.get(getSpotTypeForVehicle(vType))) {
      if (p.isEmpty()) {
        return true;
      }
    }
    return false;
  }

  private ParkingSpotType getSpotTypeForVehicle(VehicleType vType) {
    switch (vType) {
      case TWO_WHEELER:
        return ParkingSpotType.TWO_WHEELER_PARKING;
      case FOUR_WHEELER:
        return ParkingSpotType.FOUR_WHEELER_PARKING;
      case HEAVY:
        return ParkingSpotType.HEAVY_PARKING;
      case HANDICAPPED:
        return ParkingSpotType.HANDICAPPED_PARKING;
    }
    return null;
  }

  public ParkingSpot getSpot(Vehicle v) {
    List<ParkingSpot> availableSpaces = new ArrayList<>();
    for (ParkingSpot p : parkingSpots.get(getSpotTypeForVehicle(v.getVehicleType()))) {
      if (p.isEmpty()) {
        availableSpaces.add(p);
      }
    }
    return ParkingLot.INSTANCE.getParkingStrategy().park(availableSpaces);


  }
}
