package DesignPatterns.Structural.decorator.problem;

public class CapacchinoWithCoffeeBeans extends Coffee {

  @Override
  public int cost() {
    return 180 + 20;
  }
}
