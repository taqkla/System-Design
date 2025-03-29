package OOPPrinciple.abstraction;

public class Account {

  private int balance;
  private int accountNumber;

  private String ifsc;

  private String accountType;

  public Account(int balance) {
    this.balance = balance;
    this.accountNumber = 123456;
    this.ifsc = "hkdfrst654";
    this.accountType = "SAVINGS";
  }

// constructor

  // getters and setters
  void displayAccount() {
    System.out.println();
  }

  // withdraw();
  // deposit();


  void autoDebit() {
    // check if the time is to perform debit operation
    // if yes,
    // check if the balance is there to be debited.
    // perform the autoDebit()
    // send otp
    // confirm otp
    // send notification
    // deposit the amount to the creditor account.
    // else
    // sleep for sometime
  }
}


