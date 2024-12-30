package DesignPrinciples.InterfaceSegreggation.Good;

import DesignPrinciples.InterfaceSegreggation.CoffeeMachine;

public class Main {

  public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachineImp();
    coffeeMachine.save();
    coffeeMachine.EnjoyWithPet();
    coffeeMachine.OpenGarage();

    // Interface and abstract class - if you want your clients to implement certain methods and use some common methods.
  }
}
