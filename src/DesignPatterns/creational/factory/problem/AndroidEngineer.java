package DesignPatterns.creational.factory.problem;

public class AndroidEngineer implements Employee {

  @Override
  public int salary() {
    return 100000;
  }

  @Override
  public String name() {
    return "Android Developer";
  }
}
