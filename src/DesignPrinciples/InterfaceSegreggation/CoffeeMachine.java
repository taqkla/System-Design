package DesignPrinciples.InterfaceSegreggation;

public abstract class CoffeeMachine {


  public void OpenGarage() {
    System.out.println("Opening a Garage");
  };

  public void EnjoyWithPet() {
    System.out.println("Enjoying with Pet!");
  }


  public abstract void save();
}
