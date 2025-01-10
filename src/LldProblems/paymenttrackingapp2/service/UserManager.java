package LldProblems.paymenttrackingapp2.service;

import LldProblems.EventBusWithRetry.model.EntityId;
import LldProblems.paymenttrackingapp2.model.User;
import java.util.HashMap;
import java.util.Map;

// # singleton
public class UserManager {

  private static UserManager instance;
  private final Map<EntityId, User> users;

  private UserManager() {
    users = new HashMap<>();
  }

  public synchronized static UserManager getInstance() {
    if (instance == null) {
      instance = new UserManager();
    }
    return instance;
  }

  public void addUser(User user) {
    users.put(user.getUserId(), user);
  }

  public User getUser(EntityId userId) {
    return users.get(userId);
  }
}
