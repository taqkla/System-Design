package OOPPrinciple.inheritance;


/**
 * Inherit all or some properties/methods of a parent class. child class can access all non-private
 * data and methods of a parent class. Whenever the child object is created, it will create a parent
 * object and use.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Cat cat = new Cat();
    Cat cat2 = new Cat("Dolie");
    System.out.println(cat.getEnergy());
    // cat.simulateBehaviour(5);
    // ((Cat) cat).makeSound();
    // System.out.println(ExpainPoly.add(10, 5));

    Animal whale = new Whale("BlueWhale");

    // Animal cat = new Cat("Furry");
    // Cat cat2 = new Cat();
    // System.out.println(cat.name + cat2.name);
    // type, hunger, name, energy --- cat
    // hunger, name, energy --- animal
    // Reference Type decides the accessibility of variables and functions.

    // Cat cat = new Animal();
    // you cannot store parent object in a child reference.
    // type, hunger, name, energy --- cat
    // hunger, name, energy --- animal
  }
}