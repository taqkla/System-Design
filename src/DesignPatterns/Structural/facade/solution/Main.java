package DesignPatterns.Structural.facade.solution;

/**
 * Facade is a structural design pattern that provides a simplified interface to a library, a
 * framework, or any other complex set of classes.
 */
public class Main {


  public static void main(String[] args) throws Exception {
    // Check account
    // Check security PIN
    // Credit/debit balance
    // Make ledger entry
    // Send notification

    // Dependency Injection
    Account account = new Account(1, "Prateek");
    Wallet wallet = new Wallet(100);
    SecurityCode code = new SecurityCode(435);
    Ledger ledger = new Ledger();
    Notification notification = new Notification();

    AccountFacade facade = new AccountFacade(account, wallet, code, ledger, notification);

    facade.addMoneyToWallet(2000);
    facade.deductMoneyFromWallet(432);

  }

}
