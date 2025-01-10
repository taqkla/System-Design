package LldProblems.paymenttrackingapp2;

import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Expense;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.service.UserManager;
import LldProblems.paymenttrackingapp2.service.factory.EqualExpenseFactory;
import LldProblems.paymenttrackingapp2.service.factory.ExpenseFactory;
import LldProblems.paymenttrackingapp2.service.observer.Observer;
import java.util.ArrayList;
import java.util.List;

class PaymentTrackingAppFacade {

  private final UserManager userManager;
  private final List<Expense> expenses;
  private final List<Observer> observers;

  public PaymentTrackingAppFacade() {
    this.userManager = UserManager.getInstance();
    this.expenses = new ArrayList<>();
    this.observers = new ArrayList<>();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void addUser(User user) {
    userManager.addUser(user);
  }

  public void addEqualExpense(Amount totalAmount, List<User> participants) {
    ExpenseFactory factory = new EqualExpenseFactory();
    Expense expense = factory.createExpense(totalAmount, participants);
    expenses.add(expense);

    notifyObservers();
  }

  // Other facade methods...

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}