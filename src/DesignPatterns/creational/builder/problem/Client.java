package DesignPatterns.creational.builder.problem;

/**
 * Builder design pattern: when the class contains too many attributes, then there are many problems
 * exists: 1. we have to pass many argument to create object. 2. some params might be optional. So,
 * In builder pattern, we create object step by step and finally return final object with only
 * design params filled.
 * 89 columns in user table
 */
public class Client {

  public static void main(String[] args) {
    Address address = new Address(711103, "Fern City Road");
    User user = new User("Prateek", 19, "9234526751", address, "abc@gmail.com"); // good option
    User user2 = new User("Prateek", 19,"0", null,  "abc@gmail.com");
    User user3 = new User("Prateek", 19,"9123", null,  "");
    User user4 = new User("Prateek", 0, null, null, null);
    System.out.println(user.toString());
  }
}
