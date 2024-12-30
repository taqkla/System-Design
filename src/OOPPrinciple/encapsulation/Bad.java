package OOPPrinciple.encapsulation;

// Code
class Account {

  // properties
  private int balance;

  // constructor
  Account(int initialBalance) {
    this.balance = initialBalance;
  }

  // behaviours
  int displayBalance() {
    return this.balance;
  }

  void addBalance(int value) {
    this.balance += value;
  }

  void debitBalance(int value) {
    this.balance -= value;
  }
}
public class Bad {

  public static void main(String[] args) {
    Account savingAccount = new Account(32);
    savingAccount.addBalance(23);
    System.out.println(savingAccount.displayBalance());
  }

}
