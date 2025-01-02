package DesignPatterns.Structural.decorator.solution;

public class Main {

  public static void main(String[] args) {

    Coffee coffee = new CoffeeBean(new Milk(new CapacchinoCoffee()));
    System.out.println(coffee.cost());
  }

}
