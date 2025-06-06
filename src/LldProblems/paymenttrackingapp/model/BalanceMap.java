package LldProblems.paymenttrackingapp.model;

import java.util.HashMap;
import java.util.Map;

/**
 * userId --- pay amount
 */
public class BalanceMap {

  private final Map<String, Amount> balances; // userid, balance

  public BalanceMap() {
    this.balances = new HashMap<>();
  }

  public BalanceMap(Map<String, Amount> resultBalances) {
    this.balances = resultBalances;
  }

  public Map<String, Amount> getBalances() {
    return balances;
  }

  @Override
  public String toString() {
    return "BalanceMap{" +
        "balances=" + balances +
        '}';
  }
}
