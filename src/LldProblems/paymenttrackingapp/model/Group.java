package LldProblems.paymenttrackingapp.model;

import java.util.List;


/**
 * Single Responsibility -- Store the entity to be used.
 */
public class Group {

  private final String name;
  private final String desc;
  private final String imageUrl;
  private final List<String> userList;

  public Group(String name, String desc, String imageUrl, List<String> userList) {
    this.name = name;
    this.desc = desc;
    this.imageUrl = imageUrl;
    this.userList = userList;
  }

  public List<String> getUsers() {
    return userList;
  }
}
