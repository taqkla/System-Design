package DesignPatterns.Structural.decorator.problem;

public class CapacchinoWithLatteAndExtraBeansWithCream extends Coffee {

  @Override
  public int cost() {
    return 200 + 35 + 20 + 45;
  }
}
