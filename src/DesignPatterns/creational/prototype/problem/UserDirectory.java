package DesignPatterns.creational.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class UserDirectory implements Cloneable {

  private String dId;

  @Override
  protected UserDirectory clone() throws CloneNotSupportedException {
    // logic
    UserDirectory ud2 = new UserDirectory();
    ud2.users = this.users;
    ud2.dId = this.dId;
    return ud2;
  }

  private List<User> users = new ArrayList<>();

  public void setDId(String dId) {
    this.dId = dId;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }


  public String getDId() {
    return dId;
  }

  public List<User> getUsers() {
    return users;
  }

  public void loadUsers() {
    for (int i = 0; i < 10; i++) {
      // Database - all the user entries from DB - 400ms - 1s
      User user = new User();
      user.setUserName("" + i);
      user.setUserId(i);
      user.setEmail("" + i + "@gmail.com");
      this.getUsers().add(user);
    }
  }

  @Override
  public String toString() {
    return "UserDirectory{" +
        "dId='" + dId + '\'' +
        ", users=" + users +
        '}';
  }

}
