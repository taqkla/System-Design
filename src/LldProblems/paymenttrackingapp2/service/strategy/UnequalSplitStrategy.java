package LldProblems.paymenttrackingapp2.service.strategy;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.User;
import java.util.List;
import java.util.Map;

public class UnequalSplitStrategy implements SplitStrategy {

  public Map<User, Double> splitExpense(Amount totalAmount, List<User> participants) {
    // Custom splitting logic based on user preferences, weights, etc.
    // For simplicity, we'll use equal splitting for demonstration purposes.
    return new EqualSplitStrategy().splitExpense(totalAmount, participants);
  }
}
