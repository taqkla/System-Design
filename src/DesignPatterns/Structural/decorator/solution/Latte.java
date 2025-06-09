package DesignPatterns.Structural.decorator.solution;


// latte is a coffee
public class Latte extends ExtraToppings {

  Coffee coffee; // latte has-a coffee

  public Latte(Coffee coffee) {
    this.coffee = coffee;
  }

  @Override
  public int cost() {
    return this.coffee.cost() + 40;
  }
}
