package DesignPrinciples.SingleResponsibilityPrinciple.Bad;

public class Credentials {

  private String id;
  private String email;

  private String password;
  private String username;

  public Credentials(String id, String email, String password, String username) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.username = username;
  }
}
