package DesignPatterns.Structural.bridge.solution;

public class Dog extends LivingThings {

  public Dog(BreatheImplementer breatheImplementer) {
    super(breatheImplementer);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementer.breathe();
  }
}
