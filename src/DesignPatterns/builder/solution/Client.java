package DesignPatterns.builder.solution;

import DesignPatterns.builder.solution.User.UserBuilder;

public class Client {

  /**
   * In builder pattern, only set the params which is needed while creating object.
   */
  public static void main(String[] args) {
    Address address = new Address(711103, "Fern City Road");
    UserBuilder userBuilder = new UserBuilder();
    userBuilder.setName("Prateek");
    userBuilder.setAge(19);
    userBuilder.setAddress(address);
    userBuilder.setPhoneNumber("9132456276");
    User user = userBuilder.build();
    // User user = new User.UserBuilder().setName("Prateek").setAge(19).setAddress(address).build();
    System.out.println(user.toString());
    // UserBuilder userBuilder1 = user.toBuilder(user);
    // userBuilder1.setName("Nirbhay");
    userBuilder.setName("Nirbhay");
    System.out.println(userBuilder.build().toString());
  }
}
