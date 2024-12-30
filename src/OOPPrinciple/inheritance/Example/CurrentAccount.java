package OOPPrinciple.inheritance.Example;

public class CurrentAccount extends Account {

  private double interestRate;
  public CurrentAccount(String accountNumber, double balance) {
    super(accountNumber, balance);
    this.interestRate = 7.2;
  }

  void addInterest() {
    setBalance(getBalance() * interestRate);
  }
}
