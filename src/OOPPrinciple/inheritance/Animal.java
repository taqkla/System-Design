package OOPPrinciple.inheritance;

class Animal {

  private int energy = 100;
  private int hunger;
  protected final String name;

  Animal(String name) {
    this.name = name;
    System.out.println("This is a parent class parameterized constructor");
  }

  Animal() {
    System.out.println("This is a parent class empty constructor");
    this.name = "Prateek";
  }

  protected void play() {
    energy -= 10;
    hunger += 10;
  }

  protected void sleep() {
    energy = 100;
    hunger += 1;
  }

  protected void eat() {
    energy -= 1;
    hunger = 0;
  }

  protected void simulate() {
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

