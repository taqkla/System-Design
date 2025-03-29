package OOPPrinciple.inheritance;

public class Dog extends Animal {

  Dog(String name) {
    super(name);
  }

  protected void simulate() {
    if (getEnergy() < 10) {
      sleep();
    } else if (getHunger() > 90) {
      eat();
    } else {
      play();
    }
  }

  /**
   * Automatically simulates a behaviour of an animal for N actions.
   */
  public void simulateBehaviour(int n) {
    while (n-- > 0) {
      simulate();
      System.out.println("Energy: " + getEnergy() + " Hunger: " + getHunger());
    }
  }
}
