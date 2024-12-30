package DesignPatterns.adapter.solution;

/**
 * The adapter design pattern is a structural pattern that allows you to convert the interface of a
 * class into another interface that you are interested in. This can be useful when you need to
 * integrate a legacy system with a new system that has a different interface.
 */
public class Client {

  public static void main(String[] args) {

    AndroidCharger androidCharger = new NomadCharger();

    // android charger - C-type pin
    // Adapter - white device
    // apple charger - lightening cable
    AppleCharger appleCharger = new AdapterCharger(androidCharger);
    Iphone iphone15 = new Iphone(appleCharger);
    iphone15.charge();
  }
}
