package DesignPatterns.Structural.facade.problem;

/**
 * Facade is a structural design pattern that provides a simplified interface to a library, a
 * framework, or any other complex set of classes.
 */
public class Main {


  public static void main(String[] args) {
    // Check account
    // Check security PIN
    // Credit/debit balance
    // Make ledger entry
    // Send notification

    Account account = new Account(1, "Prateek");
    Wallet wallet = new Wallet(100);
    SecurityCode code = new SecurityCode(435);
    Ledger ledger = new Ledger();
    Notification notification = new Notification();

    creditBalanceToWallet(account, wallet, code, ledger, notification);
    debitBalanceFromWallet(account, wallet, code, ledger, notification);

  }

  private static void debitBalanceFromWallet(Account account, Wallet wallet, SecurityCode code, Ledger ledger,
      Notification notification) {
    account.checkAccount();
    code.checkCode();
    wallet.creditBalance(20);
    ledger.makeEntry(account.accountNumber, "Debit", 20);
    notification.sendWalletCreditNotification();
  }

  private static void creditBalanceToWallet(Account account, Wallet wallet, SecurityCode code, Ledger ledger,
      Notification notification) {
    account.checkAccount();
    code.checkCode();
    wallet.creditBalance(100);
    ledger.makeEntry(account.accountNumber, "Credit", 100);
    notification.sendWalletCreditNotification();
  }

}
