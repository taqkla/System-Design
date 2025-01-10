package LldProblems.paymenttrackingapp2.service.command;

import LldProblems.paymenttrackingapp2.model.Expense;


class AddExpenseCommand implements ExpenseCommand {

  private Expense expense;

  public AddExpenseCommand(Expense expense) {
    this.expense = expense;
  }

  public void execute() {
    // Execute add expense logic...
    expense.calculateShares();
  }
}
