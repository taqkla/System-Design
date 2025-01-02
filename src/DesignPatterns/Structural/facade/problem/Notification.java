package DesignPatterns.Structural.facade.problem;

public class Notification {

  public void sendWalletCreditNotification() {
    System.out.println("Sending wallet credit notification");
  }

  public void sendWalletDebitNotification() {
    System.out.println("Sending wallet debit notification");
  }
}
