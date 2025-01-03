package DesignPatterns.Structural.bridge.solution;

public abstract class LivingThings {

  /**
   * Has -a relationship
   */
  BreatheImplementer breatheImplementer;

  public LivingThings(BreatheImplementer breatheImplementer) {
    this.breatheImplementer = breatheImplementer;
  }

  abstract public void breatheProcess();
}
