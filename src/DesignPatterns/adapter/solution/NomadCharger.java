package DesignPatterns.adapter.solution;

public class NomadCharger implements AndroidCharger {

  @Override
  public void charge() {
    System.out.println("Your android phone is charging.");
  }
}
