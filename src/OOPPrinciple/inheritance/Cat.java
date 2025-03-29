package OOPPrinciple.inheritance;

// access modes -- public private protected
// default
// Using constructors we initialize the member variables.
// super keyword helps the child to access the parent variables or functions.

public class Cat /* Child(Subclass) */ extends Animal /* Parent(Superclass) */ {

  private String type;
  private String name;

  public Cat(String name) {
    super("Dolie");
    this.name = name;
    this.type = "Clean";
    System.out.println("This is a child class" + super.name);
    // super.energy = 12;
    // this.energy = 12;
  }

  public Cat() {
    super();
    this.name = "Furry";
    System.out.println("This is a child class");
    this.type = "Fur";
  }

  public void makeSound() {
    System.out.println("meow");
  }

  // /**
  //  * Function overriding: Compile time polymorphism.
  //  */
  // @Override
  // protected void simulate() {
  //   if (super.energy <= 10) {
  //     sleep();
  //   } else if (hunger >= 90) {
  //     eat();
  //   } else {
  //     play();
  //     makeSound();
  //   }
  // }

  protected void simulate() {
    if (this.getEnergy() < 10) {
      sleep();
    } else if (this.getHunger() > 90) {
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
