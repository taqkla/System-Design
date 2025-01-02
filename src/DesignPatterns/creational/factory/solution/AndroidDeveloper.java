package DesignPatterns.creational.factory.solution;

public class AndroidDeveloper implements Employee {

  @Override
  public int salary() {
    return 100000;
  }

  @Override
  public String name() {
    return "Android Developer";
  }
}
