package LldProblems.paymenttrackingapp2.service.observer;

import LldProblems.EventBusWithRetry.model.EntityId;

public class ExpenseObserver implements Observer {

  private EntityId id;

  public ExpenseObserver(EntityId id) {
    this.id = id;
  }

  public void update() {
    System.out.println(id.getId() + " got notified for expense update.");
    // Update logic for expenses...
  }
}
