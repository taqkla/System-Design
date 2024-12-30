package OOPPrinciple.inheritance.Example;

public class SavingAccount extends Account {


  private double interestRate;

  public SavingAccount(String accountNumber, double balance) {
    super(accountNumber, balance);
    this.interestRate = 6.4;
  }

  void addInterest() {
    setBalance(getBalance() * interestRate);
  }
}
