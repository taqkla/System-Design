package DesignPatterns.adapter.problem;

public class TataCharger implements AppleCharger {

  @Override
  public void charge() {
    System.out.println("Your Iphone is charging.");
  }
}
