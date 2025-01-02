package DesignPatterns.creational.abstractfactory.problem;

public class MacButton implements Button {

  @Override
  public void paint() {
    System.out.println("You have created MacOs Button");
  }
}
