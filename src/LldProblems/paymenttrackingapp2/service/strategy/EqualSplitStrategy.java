package LldProblems.paymenttrackingapp2.service.strategy;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy {

  public Map<User, Double> splitExpense(Amount totalAmount, List<User> participants) {
    Map<User, Double> shares = new HashMap<>();
    double share = totalAmount.getAmount() / participants.size();
    for (User participant : participants) {
      shares.put(participant, share);
    }
    return shares;
  }
}
