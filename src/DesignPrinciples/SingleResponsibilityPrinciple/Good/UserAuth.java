package DesignPrinciples.SingleResponsibilityPrinciple.Good;

import DesignPrinciples.SingleResponsibilityPrinciple.Bad.User;

//SHA256 --->

public class UserAuth {

  private User user;

  UserAuth(User user) {
    this.user = user;
  }

  public boolean authorize() {
    // put all the logic to authorize here.
    return true;
  }

}
