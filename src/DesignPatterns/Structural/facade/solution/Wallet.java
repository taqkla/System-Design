package DesignPatterns.Structural.facade.solution;

public class Wallet {

  int balance;

  public Wallet(int balance) {
    this.balance = balance;
  }

  public int creditBalance(int amount) {

    this.balance += amount;
    return this.balance;
  }

  public int debitBalance(int amount) throws Exception {
    if (this.balance < amount) {
      throw new Exception("Invalid Amount, can't be debited!");
    }
    this.balance -= amount;
    return this.balance;
  }
}
