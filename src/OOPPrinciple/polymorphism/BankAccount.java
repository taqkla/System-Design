package OOPPrinciple.polymorphism;


class SavingAccount extends BankAccount {

  @Override
  public void calculateInterest() {
    System.out.println("Calculating Interest for Saving Bank Account");
  }
}

class CurrentAccount extends BankAccount {

  @Override
  public void calculateInterest() {
    System.out.println("Calculating Interest for Current Bank Account");
  }
}

/**
 * Function Overriding -- override a function defined in parent class in child class. Runtime
 * Polymorphism.
 */
public class BankAccount {


  public void calculateInterest() {
    System.out.println("Calculating Interest for Bank Account");
  }

  public static void main(String[] args) {
    BankAccount svc = new SavingAccount();
    svc.calculateInterest();
    BankAccount bankAccount = new BankAccount();
    bankAccount.calculateInterest();
  }
}


