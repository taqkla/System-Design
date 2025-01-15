package LldProblems.parkinglot.actors;

public class LoginInfo {

  private String userName;
  private String password;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginInfo(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
}
