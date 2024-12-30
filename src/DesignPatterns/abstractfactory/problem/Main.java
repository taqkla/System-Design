package DesignPatterns.abstractfactory.problem;

public class Main {

  public static Client configureClient() {

    String osName = System.getProperty("os.name").toLowerCase();
    Client client = new Client(osName);

    return client;

  }

  public static void main(String[] args) {

    Client client = configureClient();
    client.paint();
  }

}
