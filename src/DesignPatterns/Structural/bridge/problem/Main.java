package DesignPatterns.Structural.bridge.problem;

/**
 * Bridge is a structural design pattern that lets you split a large class or a set of closely
 * related classes into two separate hierarchies—abstraction and implementation—which can be
 * developed independently of each other. Bridge is a structural DP that decouples the abstraction
 * from its implementation so that two can vary independently.
 */
public class Main {

  public static void main(String[] args) {
    // We have to implement the entire breathing process inspite of having a similar breathe process,
    // wouldn't it be nice if we have decoupled the implementation and abstraction.
    LivingThings bird = new Dog();
    bird.breatheProcess();
  }

}
