package LldProblems.parkinglot.actors;

import java.util.UUID;

public abstract class Account {

  private final UUID id;

  private final String userName;

  private final ContactInfo contactInfo;

  protected Account(UUID id, String userName, ContactInfo contactInfo) {
    this.id = id;
    this.userName = userName;
    this.contactInfo = contactInfo;
  }


  abstract boolean login();

  abstract boolean signup();

  abstract void logout();

}
