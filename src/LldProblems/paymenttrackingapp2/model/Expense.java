package LldProblems.paymenttrackingapp2.model;

import LldProblems.paymenttrackingapp2.service.strategy.SplitStrategy;
import java.util.List;
import java.util.Map;

public abstract class Expense {
  protected Amount totalAmount;
  protected List<User> participants;
  protected Map<User, Double> shares;
  protected SplitStrategy splitStrategy;

  public Expense(Amount totalAmount, List<User> participants, SplitStrategy splitStrategy) {
    this.totalAmount = totalAmount;
    this.participants = participants;
    this.splitStrategy = splitStrategy;
  }

  public abstract void calculateShares();
}
