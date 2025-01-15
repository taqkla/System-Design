package LldProblems.parkinglot.services.gate;

import LldProblems.parkinglot.entities.Ticket;
import LldProblems.parkinglot.entities.Payment;
import LldProblems.parkinglot.services.payment.PaymentStrategy;
import LldProblems.parkinglot.services.payment.PaymentType;
import LldProblems.parkinglot.services.spot.ParkingSpot;
import java.time.LocalDateTime;

public class ExitGate {

  String gateId;

  public ExitGate(String gateId)
  {
    this.gateId= gateId;

  }

  public String getGateId() {
    return gateId;
  }

  public Payment makePayment(PaymentType pType, PaymentStrategy pStrategy, Ticket ticket){

    ticket.setExitTime(LocalDateTime.now());
    double cost= pStrategy.calculateCost(ticket);
    ticket.setCharges(cost);

    Payment p= new Payment(cost, ticket, pStrategy);
    p.makePayment(pType);
    ticket.setActive(false);

    freeParkingSpace(ticket.getParkingSpotAssigned());
    return p;
  }

  private void freeParkingSpace(ParkingSpot pSpace)
  {
    pSpace.removeVehicle();
  }

}
