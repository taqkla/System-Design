package LldProblems.parkinglot.actors;

import java.util.UUID;

public class Admin2 extends Account {

  protected Admin2(UUID id, String userName, ContactInfo contactInfo) {
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
