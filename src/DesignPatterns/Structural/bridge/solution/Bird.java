package DesignPatterns.Structural.bridge.solution;

public class Bird extends LivingThings {

  public Bird(AirBreatheImplementer airBreatheImplementer) {
    super(airBreatheImplementer);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementer.breathe();
  }
}
