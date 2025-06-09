package DesignPatterns.Structural.decorator.problem;

public class BlackCoffeeWithExtraBeans extends Coffee {

  @Override
  public int cost() {
    return 150 + 20;
  }
}
