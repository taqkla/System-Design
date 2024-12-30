package DesignPatterns.builder.problem;

public class User {

  private String name;
  private int age;

  private String phoneNumber;
  private Address address;

  public User(String name) {
    this.name = name;
  }
  public User(int age) {
    this.age = age;
  }

  public User(String name, String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public User(String name, int age, String phoneNumber, Address address) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  @Override
  public String toString() {
    return "User {" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", address=" + address.toString() +
        '}';
  }
}
