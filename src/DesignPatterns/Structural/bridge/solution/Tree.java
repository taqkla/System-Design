package DesignPatterns.Structural.bridge.solution;

public class Tree extends LivingThings {

  public Tree(BreatheImplementer breatheImplementer) {
    super(breatheImplementer);
  }

  @Override
  public void breatheProcess() {
    this.breatheImplementer.breathe();
  }
}
