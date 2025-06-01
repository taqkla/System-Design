package DesignPrinciples.dry;

public class Validate {
  public static boolean validateEmail(String email) {
    if(email == null || email.isEmpty() || !email.contains("@") ) {
      return false;
    }
    return true;
  }
}
