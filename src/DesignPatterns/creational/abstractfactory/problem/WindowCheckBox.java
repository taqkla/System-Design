package DesignPatterns.creational.abstractfactory.problem;

public class WindowCheckBox implements CheckBox {

  @Override
  public void paint() {
    System.out.println("You have created WindowsOs Checkbox!");
  }
}
