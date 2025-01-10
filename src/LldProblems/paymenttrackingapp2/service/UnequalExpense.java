package LldProblems.paymenttrackingapp2.service;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.service.strategy.UnequalSplitStrategy;
import java.util.List;

public class UnequalExpense extends Expense {

  public UnequalExpense(Amount totalAmount, List<User> participants) {
    super(totalAmount, participants, new UnequalSplitStrategy());
  }

  public void calculateShares() {
    shares = splitStrategy.splitExpense(totalAmount, participants);
  }
}
