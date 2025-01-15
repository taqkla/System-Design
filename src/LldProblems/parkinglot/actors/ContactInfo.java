package LldProblems.parkinglot.actors;

import DesignPatterns.creational.builder.solution.Address;

public class ContactInfo {

  private String phone;
  private String email;
  private Address address;

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ContactInfo(String phone, String email, Address address) {
    this.phone = phone;
    this.email = email;
    this.address = address;
  }
}
