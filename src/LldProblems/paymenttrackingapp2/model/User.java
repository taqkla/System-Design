package LldProblems.paymenttrackingapp2.model;

import DesignPatterns.creational.builder.solution.Address;
import LldProblems.EventBusWithRetry.model.EntityId;

public class User {

  private final String name;
  private final int age;

  private final EntityId userId;

  private final String phoneNumber;

  private final String bio;
  private final String imageUrl;

  User(UserBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.phoneNumber = builder.phoneNumber;
    this.bio = builder.bio;
    this.imageUrl = builder.imageUrl;
    this.userId = builder.userId;
  }

  public String getName() {
    return name;
  }

  public EntityId getUserId() {
    return userId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public UserBuilder toBuilder(
      User user) {
    UserBuilder userBuilder = new UserBuilder();
    userBuilder.setName(user.name);
    userBuilder.setAge(user.age);
    userBuilder.setPhoneNumber(user.phoneNumber);
    userBuilder.setBio(user.bio);
    userBuilder.setImageUrl(user.imageUrl);
    userBuilder.setUserId(user.userId);
    return userBuilder;
  }

  // 1. Define another class with Builder(UserBuilder) suffix
  // 2. Define same properties in this class.
  // 3. Create setter to set the values, return the Builder object(this)
  // 4. Build will create an object of actual class(User)
  public static class UserBuilder {

    public EntityId userId;
    private String bio;
    private String imageUrl;


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

    public UserBuilder setBio(String bio) {
      this.bio = bio;
      return this;
    }

    public UserBuilder setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    public UserBuilder setUserId(EntityId userId) {
      this.userId = userId;
      return this;
    }

    public User build() {
      User user = new User(this /* user builder object */);
      return user;
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", userId=" + userId +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", bio='" + bio + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        '}';
  }
}