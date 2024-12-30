package DesignPatterns.adapter.problem;

public class Android {

  private AndroidCharger androidCharger;

  public Android(AndroidCharger androidCharger) {
    this.androidCharger = androidCharger;
  }

  public void charge() {
    this.androidCharger.charge();
  }

  ;
}
