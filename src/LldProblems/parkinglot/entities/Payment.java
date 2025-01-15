package LldProblems.parkinglot.entities;

import LldProblems.parkinglot.entities.Ticket;
import LldProblems.parkinglot.services.payment.PaymentStrategy;
import LldProblems.parkinglot.services.payment.PaymentType;
import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {

  private final String paymentId;
  private final LocalDateTime pTime;
  private final double amount;
  private final Ticket ticket;
  private PaymentType pType;
  private final PaymentStrategy pStrategy;

  public Payment(double amount, Ticket ticket, PaymentStrategy pStrategy){
    this.paymentId= UUID.randomUUID().toString();
    this.pTime= LocalDateTime.now();
    this.amount= amount;
    this.pStrategy= pStrategy;
    this.ticket= ticket;


  }

  public String getPaymentId() {
    return paymentId;
  }

  public LocalDateTime getpTime() {
    return pTime;
  }

  public double getAmount() {
    return amount;
  }

  public Ticket getTicket() {
    return ticket;
  }

  public PaymentType getpType() {
    return pType;
  }

  public PaymentStrategy getpStrategy() {
    return pStrategy;
  }

  public void makePayment(PaymentType pType)
  {
    this.pType= pType;
  }

}
