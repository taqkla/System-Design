package DesignPatterns.Structural.decorator.solution;

public class CoffeeBean extends ExtraToppings /*is a relationship with Coffee */ {

  Coffee coffee; // has a relationship with coffee class

  public CoffeeBean(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public int cost() {
    return this.coffee.cost() + 25;
  }
}
