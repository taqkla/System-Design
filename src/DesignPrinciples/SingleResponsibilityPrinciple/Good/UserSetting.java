package DesignPrinciples.SingleResponsibilityPrinciple.Good;

import DesignPrinciples.SingleResponsibilityPrinciple.Bad.User;

public class UserSetting {

  private User user;
  private UserAuth userAuth;

  public UserSetting(User user, UserAuth userAuth) {
    this.user = user;
    this.userAuth = userAuth;
  }

  void changeSettings(UserSetting userSetting) {
    if(userAuth.authorize()) {
      // logic to apply user settings.
    }
  }

  void displaySetting() {

  }
}
