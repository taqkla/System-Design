package DesignPatterns.Structural.bridge.solution;


public class Cat extends LivingThings {

  public Cat(BreatheImplementer breatheImplementer) {
    super(breatheImplementer);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementer.breathe();

  }
}
