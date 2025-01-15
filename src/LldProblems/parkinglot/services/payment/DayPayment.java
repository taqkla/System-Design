package LldProblems.parkinglot.services.payment;

import LldProblems.parkinglot.entities.Ticket;
import java.time.temporal.ChronoUnit;

public class DayPayment extends PaymentStrategy {


  public DayPayment() {
    this.setFourWheelerCharges(200);
    this.setTwoWheelerCharges(100);
    this.setHeavyVehicleCharges(300);
    this.setHandicappedVehicleCharges(50);
  }

  @Override
  public double calculateCost(Ticket ticket) {
    long days = ChronoUnit.DAYS.between(ticket.getExitTime(), ticket.getEntryTime());
    return days * getChargeType(ticket.getVehicle());
  }
}
