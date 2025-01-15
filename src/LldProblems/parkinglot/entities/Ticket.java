package LldProblems.parkinglot.entities;

import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

  private final String ticketId;

  private final LocalDateTime entryTime;
  private final Vehicle vehicle;
  private final ParkingSpot parkingSpotAssigned;
  private LocalDateTime exitTime;
  private boolean isActive;
  private double charges;

  public Ticket(Vehicle v, ParkingSpot pSpace) {
    this.ticketId = UUID.randomUUID().toString();
    this.entryTime = LocalDateTime.now();
    this.isActive = true;
    this.vehicle = v;
    this.parkingSpotAssigned = pSpace;
  }

  public String getTicketId() {
    return ticketId;
  }

  public LocalDateTime getEntryTime() {
    return entryTime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public ParkingSpot getParkingSpotAssigned() {
    return parkingSpotAssigned;
  }

  public LocalDateTime getExitTime() {
    return exitTime;
  }

  public boolean isActive() {
    return isActive;
  }

  public double getCharges() {
    return charges;
  }

  @Override
  public String toString() {
    return "Ticket{" +
        "ticketId='" + ticketId + '\'' +
        ", entryTime=" + entryTime +
        ", vehicle=" + vehicle +
        ", parkingSpotAssigned=" + parkingSpotAssigned +
        ", exitTime=" + exitTime +
        ", isActive=" + isActive +
        ", charges=" + charges +
        '}';
  }

  public void setExitTime(LocalDateTime exitTime) {
    this.exitTime = exitTime;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public void setCharges(double charges) {
    this.charges = charges;
  }
}
