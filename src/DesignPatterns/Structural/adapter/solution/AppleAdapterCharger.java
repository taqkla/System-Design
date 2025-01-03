package DesignPatterns.Structural.adapter.solution;

public class AppleAdapterCharger implements AppleCharger /** Expected interface */ {

  /**
   * Actual interface that we have.
   */
  private AndroidCharger androidCharger;

  public AppleAdapterCharger(AndroidCharger androidCharger) {
    this.androidCharger = androidCharger;
  }

  @Override
  public void charge() {
    this.androidCharger.charge();
    System.out.println("Your iphone is getting charged with android charger via adapter.");
  }
}
