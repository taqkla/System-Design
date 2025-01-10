package LldProblems.paymenttrackingapp2.service.factory;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.service.UnequalExpense;
import java.util.List;

class UnequalExpenseFactory implements ExpenseFactory {

  public Expense createExpense(Amount totalAmount, List<User> participants) {
    return new UnequalExpense(totalAmount, participants);
  }
}
