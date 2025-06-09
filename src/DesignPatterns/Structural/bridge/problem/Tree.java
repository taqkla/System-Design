package DesignPatterns.Structural.bridge.problem;

public class Tree extends LivingThings {

  @Override
  public void breatheProcess() {
    // Breathe through Plant.
    // Inhales CO2
    // Exhales O2
  }
}


// Using inheritence here.
// every subclass is implementing the breathe process.