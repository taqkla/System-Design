package LldProblems.paymenttrackingapp2.service.command;

import LldProblems.paymenttrackingapp2.model.Expense;

public class EditExpenseCommand implements ExpenseCommand {

  private Expense expense;

  public EditExpenseCommand(Expense expense) {
    this.expense = expense;
  }
  @Override
  public void execute() {
    //
    expense.calculateShares();
  }
}
