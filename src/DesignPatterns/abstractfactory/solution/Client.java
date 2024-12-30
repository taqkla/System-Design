package DesignPatterns.abstractfactory.solution;

public class Client {

  private Button button;
  private CheckBox checkBox;

  Client(GuiFactory guiFactory) {
    this.button = guiFactory.createButton();
    this.checkBox = guiFactory.createCheckbox();
  }

  public void paint() {
    this.button.paint();
    this.checkBox.paint();
  }

}
