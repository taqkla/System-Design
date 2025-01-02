package DesignPatterns.Structural.facade.solution;

public class AccountFacade {

  Account account;
  Wallet wallet;
  SecurityCode code;
  Ledger ledger;

  Notification notification;

  public AccountFacade(Account account, Wallet wallet, SecurityCode code, Ledger ledger,
      Notification notification) {
    this.account = account;
    this.wallet = wallet;
    this.code = code;
    this.ledger = ledger;
    this.notification = notification;
  }

  public void addMoneyToWallet(int amt) {
    account.checkAccount();
    code.checkCode();
    System.out.println("Remaining Balance: " + wallet.creditBalance(amt));
    ledger.makeEntry(account.accountNumber, "Credit", amt);
    notification.sendWalletCreditNotification();
  }

  public void deductMoneyFromWallet(int amt) throws Exception {
    account.checkAccount();
    code.checkCode();
    System.out.println("Remaining Balance: " + wallet.debitBalance(amt));
    ledger.makeEntry(account.accountNumber, "Debit", amt);
    notification.sendWalletDebitNotification();
  }

}
