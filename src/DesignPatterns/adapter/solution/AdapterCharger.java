package DesignPatterns.adapter.solution;

public class AdapterCharger implements AppleCharger /** Expected interface */ {

  /**
   * Actual interface that we have.
   */
  private AndroidCharger androidCharger;

  public AdapterCharger(AndroidCharger androidCharger) {
    this.androidCharger = androidCharger;
  }

  @Override
  public void charge() {
    this.androidCharger.charge();
    System.out.println("Your iphone is getting charged with android charger via adapter.");
  }
}
