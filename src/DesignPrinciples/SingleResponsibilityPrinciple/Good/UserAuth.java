package DesignPrinciples.SingleResponsibilityPrinciple.Good;

import DesignPrinciples.SingleResponsibilityPrinciple.Bad.Credentials;
import DesignPrinciples.SingleResponsibilityPrinciple.Bad.User;

//SHA256 --->

public class UserAuth {

  private User user;
  private Credentials credentials;

  UserAuth(User user, Credentials credentials) {
    this.user = user;
    this.credentials = credentials;
  }

  public boolean authorize() {
    // utilize this credential object to authorize.
    // put all the logic to authorize here.
    return true;
  }

}
