package DesignPatterns.creational.builder.solution;

public class Address {

  private int zip;
  private String street;

  @Override
  public String toString() {
    return "Address {" +
        "zip=" + zip +
        ", street='" + street + '\'' +
        '}';
  }

  public Address(int zip, String street) {
    this.zip = zip;
    this.street = street;
  }
}