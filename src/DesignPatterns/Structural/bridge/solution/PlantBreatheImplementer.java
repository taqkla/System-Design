package DesignPatterns.Structural.bridge.solution;

public class PlantBreatheImplementer implements BreatheImplementer {

  @Override
  public void breathe() {
    // Breathe through leaves.
    // Inhales CO2
    // Exhales O2
    System.out.println("Breathe through leaves.\n"
        + "    Inhales CO2\n"
        + "    Exhales O2");
  }
}
