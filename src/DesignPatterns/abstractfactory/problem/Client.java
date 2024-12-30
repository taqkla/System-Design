package DesignPatterns.abstractfactory.problem;

public class Client {

  private Button button;
  private CheckBox checkBox;

  Client(String osName) {
    if (osName.equals("mac os x")) {
      this.button = new MacButton();
      this.checkBox = new MacCheckBox();
    } else {
      this.button = new WindowButton();
      this.checkBox = new WindowCheckBox();
    }
  }

  public void paint() {
    this.button.paint();
    this.checkBox.paint();
  }

}
