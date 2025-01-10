package DesignPatterns.creational.builder.solution;

public class User {

  private final String name;
  private final int age;

  private final String phoneNumber;
  private final Address address;

  User(UserBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.phoneNumber = builder.phoneNumber;
    this.address = builder.address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Address getAddress() {
    return address;
  }

  public UserBuilder toBuilder(User user) {
    UserBuilder userBuilder = new UserBuilder();
    userBuilder.setName(user.name);
    userBuilder.setAge(user.age);
    userBuilder.setPhoneNumber(user.phoneNumber);
    userBuilder.setAddress(user.address);
    return userBuilder;
  }

  // 1. Define another class with Builder(UserBuilder) suffix
  // 2. Define same properties in this class.
  // 3. Create setter to set the values, return the Builder object(this)
  // 4. Build will create an object of actual class(User)
  public static class UserBuilder {

    private String name;
    private int age;

    private String phoneNumber;
    private Address address;

    public UserBuilder() {
    }

    public UserBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public UserBuilder setAge(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public UserBuilder setAddress(Address address) {
      this.address = address;
      return this;
    }

    public User build() {
      User user = new User(this /* user builder object */);
      return user;
    }
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
