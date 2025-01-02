package DesignPatterns.creational.prototype.solution;

import java.util.ArrayList;
import java.util.List;

public class UserDirectory implements Cloneable {

  private String dId;

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

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}
