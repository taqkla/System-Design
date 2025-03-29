package OOPPrinciple.abstraction.solution;

/**
 * Abstraction :Show only “relevant” data/behaviour and “hide” unnecessary details of an object from
 * the user.
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
    System.out.println("Action: Play " + "Energy: " + energy + " Hunger: " + hunger);
  }

  private void sleep() {
    energy = 100;
    hunger += 1;
    System.out.println("Action: Sleep " + "Energy: " + energy + " Hunger: " + hunger);
  }

  private void eat() {
    energy -= 1;
    hunger = 0;
    System.out.println("Action: Eat " + "Energy: " + energy + " Hunger: " + hunger);
  }

  private void simulateDog() {
    if (energy < 10) {
      sleep();
    } else if (hunger > 90) {
      eat();
    } else {
      play();
    }
  }

  private void simulateCat() {
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
  public void simulateBehaviour(int n, String animalType) {
    if(animalType == "CAT") {
      while (n-- > 0) {
        simulateCat();
      }
    } else {
      while (n-- > 0) {
        simulateDog();
      }
    }

  }
}
