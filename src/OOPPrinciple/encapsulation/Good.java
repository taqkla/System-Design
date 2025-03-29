package OOPPrinciple.encapsulation;

// What is Encapsulation?

/**
 * Binding the data with the code that manipulates it.
 * Keeping the data and the code safe from external interference
 */

public class Good {

  static class Account {

    private int balance = 0; // No other class should be able to change this.

    public void displayBalance() {
      System.out.println("The balance in your account is " + this.balance);
    }

    // Any change happening to properties should be done from this class.
    // Any class can trigger the change.

    public void credit(int amount) {
      this.balance += amount;
    }

    public void debit(int amount) {
      this.balance -= amount;
    }
  }

  public static void main(String[] args) {
      Account savingAccount = new Account();
      savingAccount.credit(1000);
      savingAccount.debit(439);
      savingAccount.displayBalance();
  }
}
