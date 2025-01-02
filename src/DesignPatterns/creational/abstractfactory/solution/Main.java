package DesignPatterns.creational.abstractfactory.solution;

public class Main {

  public static Client configureClient() {

    Client client;
    GuiFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacOsGuiFactory();
    } else {
      factory = new WindowsOsGuiFactory();
    }
    client = new Client(factory);
    return client;

  }

  public static void main(String[] args) {

    Client client = configureClient();
    client.paint();
  }

}
