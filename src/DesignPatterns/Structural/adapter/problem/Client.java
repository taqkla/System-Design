package DesignPatterns.Structural.adapter.problem;

/**
 * The adapter design pattern is a structural pattern that allows you to convert the interface of a
 * class into another interface that you are interested in. This can be useful when you need to
 * integrate a legacy system with a new system that has a different interface.
 */
public class Client {

  public static void main(String[] args) {

    AppleCharger appleCharger = new TataCharger();
    Iphone iphone = new Iphone(appleCharger);
    iphone.charge();

    AndroidCharger androidCharger = new NomadCharger();
    Android android = new Android(androidCharger);
    android.charge();
  }
}
