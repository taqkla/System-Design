package LldProblems.paymenttrackingapp2.service.factory;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import java.util.List;

public interface ExpenseFactory {

  Expense createExpense(Amount totalAmount, List<User> participants);
}


