package DesignPatterns.Structural.bridge.solution;

public class WaterBreatheImplementer implements BreatheImplementer {

  @Override
  public void breathe() {
    System.out.println("Breathe through Gills.\n"
        + "    Inhales O2 from Water.\n"
        + "    Exhales CO2");
  }
}
