package DesignPrinciples;

public class Dry {

}

class Registration {


  boolean validate(String email) {
    if(email == null || email.isEmpty() || !email.contains("@") ) {
      return false;
    }
    return true;
  }
}

class Login {

  boolean validate(String email) {
    if(email == null || email.isEmpty() || !email.contains("@") ) {
      return false;
    }
    return true;
  }
}


class Validate {
  boolean validate(String email) {
    if(email == null || email.isEmpty() || !email.contains("@") ) {
      return false;
    }
    return true;
  }
}
