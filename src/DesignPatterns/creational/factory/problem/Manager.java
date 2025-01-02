package DesignPatterns.creational.factory.problem;

public class Manager implements Employee {

  @Override
  public int salary() {
    return 5000000;
  }

  @Override
  public String name() {
    return "Manager";
  }
}
