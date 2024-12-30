package DesignPatterns.abstractfactory.solution;

public class WindowsOsGuiFactory implements GuiFactory {

  @Override
  public Button createButton() {
    return new WindowButton();
  }

  @Override
  public CheckBox createCheckbox() {
    return new WindowCheckBox();
  }
}
