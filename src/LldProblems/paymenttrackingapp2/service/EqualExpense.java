package LldProblems.paymenttrackingapp2.service;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.service.strategy.EqualSplitStrategy;
import java.util.List;

public class EqualExpense extends Expense {

  public EqualExpense(Amount totalAmount, List<User> participants) {
    super(totalAmount, participants, new EqualSplitStrategy());
  }

  public void calculateShares() {
    shares = splitStrategy.splitExpense(totalAmount, participants);
  }
}
