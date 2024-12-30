package DesignPatterns.abstractfactory.solution;

public class WindowButton implements Button {

  @Override
  public void paint() {
    System.out.println("You have created WindowsOs Button");
  }
}
