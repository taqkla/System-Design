package DesignPatterns.Structural.bridge.solution;

public class Fish extends LivingThings {

  public Fish(BreatheImplementer breatheImplementer) {
    super(breatheImplementer);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementer.breathe();
  }

}
