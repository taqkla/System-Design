package LldProblems.paymenttrackingapp;

import LldProblems.paymenttrackingapp.service.ExpenseService;
import LldProblems.paymenttrackingapp.service.GroupService;

public class PaymentTrackingApp {

  private final GroupService groupService;
  private final ExpenseService expenseService;

  public PaymentTrackingApp(GroupService groupService, ExpenseService expenseService) {
    this.groupService = groupService;
    this.expenseService = expenseService;
  }

}
