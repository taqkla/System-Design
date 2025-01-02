package DesignPatterns.Structural.decorator.solution;

public class Latte extends ExtraToppings {

  Coffee coffee;

  public Latte(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public int cost() {
    return this.coffee.cost() + 40;
  }
}
