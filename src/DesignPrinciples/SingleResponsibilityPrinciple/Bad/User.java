package DesignPrinciples.SingleResponsibilityPrinciple.Bad;

/**
 * **Single Responsibility Principle** Definition: A class should have one and only one reason to
 * change, meaning that a class should have only one job. BankAccount: Imagine a restaurant where
 * the chef also serves as the waiter, cashier, and dishwasher. While it's possible for one person to
 * do all these tasks, it's inefficient and prone to errors.In an ideal restaurant, each person has
 * a specific role: the chef cooks, the waiter serves, and the cashier handles payments.Each person
 * has a single responsibility, making the whole operation more efficient and manageable.
 */

public class User {

  private String name;
  private Credentials credentials;

  public User(String name, Credentials credentials) {
    this.name = name;
    this.credentials = credentials;
  }

  public void changeSettings(Settings settings, String username, String password) {
    if (this.verifyCredentials(username, password)) {
      // .....
    }
    return;
  }

  private boolean verifyCredentials(String username, String password) {
    // put all the logic for verification of credentials.
    // password type to SAML/ OTP based/ Oauth
    // entire logic need to be changed here.
    return true;
  }
}

// Just one question if one class will have only one responsibility to change
// Possible solution - Create a class for CredentialManagement(CredentialManager) and also create a
// UserSetting class that handles the SettingManagement.

// Every class that we create needs to look for extensibility.




// then won't number of classes will increase ? Also does SRP adheres to inheritance ?
