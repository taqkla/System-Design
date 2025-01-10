package LldProblems.paymenttrackingapp2.service.factory;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.service.EqualExpense;
import java.util.List;

public class EqualExpenseFactory implements ExpenseFactory {


  public Expense createExpense(Amount totalAmount, List<User> participants) {
    return new EqualExpense(totalAmount, participants);
  }
}



