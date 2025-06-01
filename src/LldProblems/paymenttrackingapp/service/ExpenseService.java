package LldProblems.paymenttrackingapp.service;

import static LldProblems.paymenttrackingapp.model.Currency.USD;

import LldProblems.paymenttrackingapp.model.Amount;
import LldProblems.paymenttrackingapp.model.BalanceMap;
import LldProblems.paymenttrackingapp.model.Expense;
import LldProblems.paymenttrackingapp.model.PaymentGraph;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class ExpenseService {

  //select * from expenses where group_id = 'groupId';
  private final Map<String, List<Expense>> groupExpenses;

  public ExpenseService() {
    this.groupExpenses = new HashMap<>();
  }

  public void addExpense(Expense expense) {
    final var groupId = expense.getGroupId();
    if (groupId != null) {
      // if(groupExpenses.containsKey(groupId) && !groupExpenses.get(groupId).isEmpty())
      groupExpenses.putIfAbsent(groupId, new ArrayList<>());
      groupExpenses.get(groupId).add(expense);
    }
  }

  public List<Expense> getGroupExpenses(String groupId) {
    return groupExpenses.get(groupId);
  }

  public PaymentGraph getPaymentGraph(BalanceMap groupBalances) {
    // comparator
    final Comparator<Entry<String, Amount>> ascending = Comparator.comparingDouble(
        balance -> balance.getValue().getAmount());
    final PriorityQueue<Map.Entry<String, Amount>>
        positiveAmounts = new PriorityQueue<>(ascending.reversed()), // max heap
        negativeAmounts = new PriorityQueue<>(ascending); // min heap
    for (var balance : groupBalances.getBalances().entrySet()) {
      if (balance.getValue().getAmount() > 0) {
        positiveAmounts.add(balance);
      } else {
        negativeAmounts.add(balance);
      }
    }
    final var graph = new HashMap<String, BalanceMap>();
    while (!negativeAmounts.isEmpty()) {
      //eliminate largest from both groups
      final var largestPositive = positiveAmounts.poll();
      final var largestNegative = negativeAmounts.poll();
      final var negativeAmount = -largestNegative.getValue().getAmount();
      final var positiveAmount = largestPositive.getValue().getAmount();
      graph.putIfAbsent(largestPositive.getKey(), new BalanceMap());
      // A --- B , 100
      graph.get(largestPositive.getKey()).getBalances()
          .put(largestNegative.getKey(), new Amount(USD, Math.min(positiveAmount, negativeAmount)));
      double remaining = positiveAmount - negativeAmount;
      final var remainingAmount = new Amount(USD, remaining);
      if (remaining > 0) {
        positiveAmounts.add(
            new AbstractMap.SimpleEntry<>(largestPositive.getKey(), remainingAmount));
      } else if (remaining < 0) {
        negativeAmounts.add(
            new AbstractMap.SimpleEntry<>(largestNegative.getKey(), remainingAmount));
      }
    }
    return new PaymentGraph(graph);
  }
}
