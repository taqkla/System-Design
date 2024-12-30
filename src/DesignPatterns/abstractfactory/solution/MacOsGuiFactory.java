package DesignPatterns.abstractfactory.solution;

public class MacOsGuiFactory implements GuiFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckbox() {
    return new MacCheckBox();
  }
}
