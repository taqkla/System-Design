package LldProblems.paymenttrackingapp2;


import LldProblems.EventBusWithRetry.model.EntityId;
import LldProblems.paymenttrackingapp2.model.Amount;
import LldProblems.paymenttrackingapp2.model.Currency;
import LldProblems.paymenttrackingapp2.model.User;
import LldProblems.paymenttrackingapp2.model.User.UserBuilder;
import LldProblems.paymenttrackingapp2.service.observer.ExpenseObserver;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IllegalAccessException {
    PaymentTrackingAppFacade paymentTrackingApp = new PaymentTrackingAppFacade();

    UserBuilder userBuilder = new UserBuilder();
    userBuilder.setUserId(new EntityId("1"));
    userBuilder.setName("Prateek");
    userBuilder.setAge(19);
    userBuilder.setPhoneNumber("9132456276");
    User user1 = userBuilder.build();
    UserBuilder userBuilder2 = new UserBuilder();
    userBuilder2.setName("Ramesh");
    userBuilder2.setUserId(new EntityId("2"));
    userBuilder2.setAge(29);
    userBuilder2.setPhoneNumber("9132456276");
    User user2 = userBuilder2.build();

    paymentTrackingApp.addUser(user1);
    paymentTrackingApp.addUser(user2);
    paymentTrackingApp.addObserver(new ExpenseObserver(user1.getUserId()));
    paymentTrackingApp.addObserver(new ExpenseObserver(user2.getUserId()));

    paymentTrackingApp.addEqualExpense(new Amount(Currency.USD, 100.0),
        Arrays.asList(user1, user2));

  }


}
