package DesignPatterns.creational.builder.problem;

public class User {

  private String name;
  private int age;

  private String phoneNumber;
  private Address address;

  private String email;

  public void setAge(int age) {
    this.age = age;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public User(String name, int age, String phoneNumber, Address address, String email) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.email = email;
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



