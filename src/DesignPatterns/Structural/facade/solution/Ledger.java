package DesignPatterns.Structural.facade.solution;

public class Ledger {

  public void makeEntry(int accountID, String txnType, int amount) {
    System.out.printf("Make ledger entry for accountId %s with txnType %s for amount %d\n",
        accountID, txnType, amount);
  }

}
