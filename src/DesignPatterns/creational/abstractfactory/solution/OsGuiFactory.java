package DesignPatterns.creational.abstractfactory.solution;

// Abstract Factory
public class OsGuiFactory {

  public static GuiFactory getGuiFactory() {
    GuiFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacOsGuiFactory();
    } else {
      factory = new WindowsOsGuiFactory();
    }
    return factory;
  }

}


// OsGuiFactory --- Object of GuiFactory ---> create the actual concrete object.
