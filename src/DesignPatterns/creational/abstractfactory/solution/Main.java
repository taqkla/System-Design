package DesignPatterns.creational.abstractfactory.solution;

public class Main {

  public static Client configureClient() {

    Client client;
    client = new Client(OsGuiFactory.getGuiFactory());
    return client;

  }

  public static void main(String[] args) {

    Client client = configureClient();
    client.paint();
  }

}
