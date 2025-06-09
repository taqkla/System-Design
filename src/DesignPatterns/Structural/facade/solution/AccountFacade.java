package DesignPatterns.Structural.facade.solution;

public class AccountFacade {

  Account account;
  Wallet wallet;
  SecurityCode code;
  Ledger ledger;

  Notification notification;

  public AccountFacade() {
    this.account = new Account(1, "Prateek");
    this.wallet = new Wallet(100);
    this.code = new SecurityCode(21);
    this.ledger = new Ledger();
    this.notification = new Notification();
  }

  public void addMoneyToWallet(int amt) {
    // Check account
    // Check security PIN
    // Credit/debit balance
    // Make ledger entry
    // Send notification
    account.checkAccount();
    code.checkCode();
    wallet.creditBalance(amt);
    System.out.println("Remaining Balance: " + wallet.creditBalance(amt));
    ledger.makeEntry(account.accountNumber, "Credit", amt);
    notification.sendWalletCreditNotification();
  }

  public void deductMoneyFromWallet(int amt) throws Exception {
    account.checkAccount();
    code.checkCode();
    wallet.debitBalance(amt);
    System.out.println("Remaining Balance: " + wallet.debitBalance(amt));
    ledger.makeEntry(account.accountNumber, "Debit", amt);
    notification.sendWalletDebitNotification();
  }

}
