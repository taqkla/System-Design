package DesignPatterns.Structural.adapter.solution;

public class TataCharger implements AppleCharger {

  @Override
  public void charge() {
    System.out.println("Your Iphone is charging.");
  }
}
