package DesignPrinciples.dry;

public class Dry {

}

class Registration {


  boolean validate(String email) {
    Validate.validateEmail(email);
    return true;
  }
}

class Login {

  boolean validate(String email, String password) {
    Validate.validateEmail(email);
    return true;

  }
}



