package DesignPatterns.Structural.bridge.solution;

public class AirBreatheImplementer implements BreatheImplementer {

  @Override
  public void breathe() {
    System.out.println("Breathe through air.\n"
        + "    Inhales O2 from Air.\n"
        + "    Exhales CO2");
  }
}
