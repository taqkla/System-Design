package DesignPatterns.Structural.bridge.solution;


/**
 * Bridge is a structural design pattern that lets you split a large class or a set of closely
 * related classes into two separate hierarchies—abstraction and implementation—which can be
 * developed independently of each other. Bridge is a structural DP that decouples the abstraction
 * from it's implementation so that two can vary independently.
 */
public class Main {

  public static void main(String[] args) {
    LivingThings dog = new Dog(new AirBreatheImplementer());
    LivingThings bird = new Bird(new AirBreatheImplementer());
    LivingThings fish = new Fish(new WaterBreatheImplementer());
    LivingThings plant = new Tree(new PlantBreatheImplementer());
    dog.breatheProcess();
    bird.breatheProcess();
    fish.breatheProcess();
    plant.breatheProcess();

    LivingThings cat = new Cat(new AirBreatheImplementer());
    cat.breatheProcess();
  }

}
