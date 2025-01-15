package LldProblems.parkinglot.services.payment;

import LldProblems.parkinglot.entities.Ticket;
import java.time.temporal.ChronoUnit;

public class HourPayment extends PaymentStrategy {

  public HourPayment() {
    this.setFourWheelerCharges(20);
    this.setTwoWheelerCharges(10);
    this.setHeavyVehicleCharges(30);
    this.setHandicappedVehicleCharges(5);
  }

  @Override
  public double calculateCost(Ticket ticket) {
    long hours = ChronoUnit.HOURS.between(ticket.getExitTime(), ticket.getEntryTime()) + 1;
    return hours * getChargeType(ticket.getVehicle());
  }
}
