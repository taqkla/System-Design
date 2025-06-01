package LldProblems.paymenttrackingapp2.service.observer;

import LldProblems.EventBusWithRetry.model.EntityId;
import java.util.List;

public class ExpenseObserver implements Observer {

  private EntityId id;


  public ExpenseObserver(EntityId id) {
    this.id = id;
  }


  @Override
  public void update() {
    // call the group service to fetch all the users and notify them.
    System.out.println(id.getId() + " got notified for expense update.");
    // Update logic for expenses...
  }
}
