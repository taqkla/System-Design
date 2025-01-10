package LldProblems.paymenttrackingapp2.service.strategy;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.User;
import java.util.List;
import java.util.Map;


/**
 * Strategy pattern for split strategy
 */
public interface SplitStrategy {

  Map<User, Double> splitExpense(Amount totalAmount, List<User> participants);

}

