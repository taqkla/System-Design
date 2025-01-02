package DesignPatterns.Structural.decorator.solution;

public class CoffeeBean extends ExtraToppings {

  Coffee coffee;

  public CoffeeBean(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public int cost() {
    return this.coffee.cost() + 25;
  }
}
