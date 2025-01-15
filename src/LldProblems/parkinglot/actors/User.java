package LldProblems.parkinglot.actors;

import java.util.UUID;

public class User extends Account {

  protected User(UUID id, String userName, ContactInfo contactInfo) {
    super(id, userName, contactInfo);
  }

  @Override
  boolean login() {
    return false;
  }

  @Override
  boolean signup() {
    return false;
  }

  @Override
  void logout() {

  }
}
