package DesignPatterns.factory.problem;

public class HumanResource implements Employee {

  @Override
  public int salary() {
    return 100340;
  }

  @Override
  public String name() {
    return "Human Resource";
  }
}
