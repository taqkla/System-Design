package LldProblems.paymenttrackingapp.service;

import LldProblems.paymenttrackingapp.model.Amount;
import LldProblems.paymenttrackingapp.model.BalanceMap;
import LldProblems.paymenttrackingapp.model.Currency;
import LldProblems.paymenttrackingapp.model.Expense;
import LldProblems.paymenttrackingapp.model.Group;
import LldProblems.paymenttrackingapp.model.PaymentGraph;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupService {

  public static final Amount NIL = new Amount(Currency.USD, 0);
  private final ExpenseService expenseService;
  private final Map<String, Group> groups; // groupId, group

  public GroupService(ExpenseService expenseService, Map<String, Group> groups) {
    this.expenseService = expenseService;
    this.groups = groups;
  }

  public PaymentGraph getGroupPaymentGraph(final String groupId, final String userId) throws IllegalAccessException {
    // user balance for a particular group
    // A -> 20
    // A -> -100
    // A -> 320
    return expenseService.getPaymentGraph(getBalances(groupId, userId));
  }

  private BalanceMap sumExpenses(List<Expense> groupExpenses) {
    final Map<String, Amount> resultBalances = new HashMap<>();
    for (Expense expense : groupExpenses) {
      for (var balance : expense.getUserBalances().getBalances().entrySet()) {
        final var user = balance.getKey();
        final var amount = balance.getValue();
        resultBalances.put(user, resultBalances.getOrDefault(user, NIL).add(amount));
      }
    }
    return new BalanceMap(resultBalances);
  }

  // userid, BalanceMap
  public BalanceMap getBalances(final String groupId, final String userId) throws IllegalAccessException {
    if (!groups.get(groupId).getUsers().contains(userId)) {
      throw new IllegalAccessException();
    }
    return sumExpenses(expenseService.getGroupExpenses(groupId));
  }
}
