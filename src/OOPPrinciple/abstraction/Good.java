package OOPPrinciple.abstraction;

/**
 * Show only “relevant” data/behaviour and “hide” unnecessary details of an object from the user.
 */
class Animal {

  protected int energy = 100;
  protected int hunger;
  protected final String name;

  Animal(String name) {
    this.name = name;
  }

  private void play() {
    energy -= 10;
    hunger += 10;
  }

  private void sleep() {
    energy = 100;
    hunger += 1;
  }

  private void eat() {
    energy -= 1;
    hunger = 0;
  }

  private void simulate() {
    if (energy < 10) {
      sleep();
    } else if (hunger > 90) {
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
      System.out.println("Energy: " + energy + " Hunger: " + hunger);
    }
  }
}

public class Good {

  // client
  public static void main(String[] args) {
    Animal animal = new Animal("OOPPrinciple.inheritance.Cat");
    animal.simulateBehaviour(12);
  }
}
