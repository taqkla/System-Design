package DesignPatterns.abstractfactory.solution;

public class MacCheckBox implements CheckBox {

  @Override
  public void paint() {
    System.out.println("You have created MacOs Checkbox!");
  }
}
