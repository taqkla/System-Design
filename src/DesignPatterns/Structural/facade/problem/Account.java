package DesignPatterns.Structural.facade.problem;

public class Account {

  int accountNumber;
  String accountHolder;


  public Account(int accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
  }

  public boolean checkAccount() {
    Account account1 = new Account(1, "Prateek");
    return account1.equals(this);
  }
}
