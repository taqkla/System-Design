package DesignPatterns.creational.builder.solution;

import DesignPatterns.creational.builder.solution.User.UserBuilder;

public class Client {

  /**
   * In builder pattern, only set the params which is needed while creating object.
   */
  public static void main(String[] args) {
    Address address = new Address(711103, "Fern City Road");
    // UserBuilder userBuilder = new UserBuilder();
    // userBuilder.setName("Prateek");
    // userBuilder.setAge(19);
    // userBuilder.setAddress(address);
    // userBuilder.setPhoneNumber("9132456276");
    // User user = userBuilder.build();
    User user1 = new User.UserBuilder().setName("Prateek").setAge(19).setAddress(address).build();
    System.out.println(user1.toString());
    user1 = user1.toBuilder().setPhoneNumber("652378456").build();
    // UserBuilder userBuilder1 = user.toBuilder(user);
    // userBuilder1.setName("Nirbhay");
    // System.out.println(userBuilder.build().toString());
  }

  // new User.UserBuilder().setName("Prateek").setAge(19).setAddress(address) - UserBuilder
  // UserBuilder.build() --- convert a builder object to actual class object


//   user1.toBuilder() - converting actual object to builder object.
}
