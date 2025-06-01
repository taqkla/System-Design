package DesignPatterns.Structural.decorator.problem;

public class Main {

  public static void main(String[] args) {

    Coffee coffee = new CapacchinoCoffee();
    System.out.println(coffee.cost());

    Coffee coffee1 = new CapacchinoWithCoffeeBeans();
  }

}
