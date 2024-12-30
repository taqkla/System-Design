package OOPPrinciple.abstraction;


public class Bad {

  static class Animal {

    private int energy = 100;
    private int hunger;

    private void displayCharacteristics() {
      System.out.println(String.format("The energy of an animal is %d and hunger is %d", energy, hunger));
    }

    private void play() {
      energy -= 10;
      hunger += 10;
      displayCharacteristics();
    }

    private void sleep() {
      energy = 100;
      hunger += 1;
      displayCharacteristics();
    }

    private void eat() {
      energy -= 1;
      hunger = 0;
      displayCharacteristics();
    }
  }

  // Client
  public static void main(String[] args) {
    Animal animal = new Animal();
    int n = 11;
    for(int i = 0; i < n; i++) {
      // This behaviour should not be exposed.
      if (animal.energy <= 10) {
        animal.sleep();
      } else if (animal.hunger >= 90) {
        animal.eat();
      } else {
        animal.play();
      }
    }
  }
}
