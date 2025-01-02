package DesignPatterns.Structural.decorator.solution;

public class Milk extends ExtraToppings {

  Coffee coffee;

  public Milk(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public int cost() {
    return this.coffee.cost() + 10;
  }
}
