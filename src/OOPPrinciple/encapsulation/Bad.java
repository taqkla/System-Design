package OOPPrinciple.encapsulation;

// Code

// Importance of Encapsulation - The state of an object (value of the properties at any moment) is a responsibility of single class/object.

class Pay {

  void debit(Account account, int amount) {
    account.removeBalance(amount);
  }
}

class Receive {

  void credit(Account account, int amount) {
    account.addBalance(amount);
  }
}

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

  void removeBalance(int value) {
    this.balance -= value;
  }
}

public class Bad {

  public static void main(String[] args) {
    Account savingAccount = new Account(32);
    savingAccount.addBalance(21);
    Pay pay = new Pay();
    pay.debit(savingAccount, 32);
    Receive receive = new Receive();
    receive.credit(savingAccount, 43);
    System.out.println(savingAccount.displayBalance());
  }

}
