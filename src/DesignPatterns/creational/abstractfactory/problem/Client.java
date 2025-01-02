package DesignPatterns.creational.abstractfactory.problem;

/**
 * The Abstract Factory pattern provides an interface for creating families of related or dependent
 * objects without specifying their concrete classes. It allows the creation of objects that are
 * compatible with each other based on the chosen factory implementation. This pattern is useful for
 * systems that need to be independent of how their products are created.
 */
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
