package DesignPatterns.behavioural.momento.solution;

/**
 * Momento :This refers to current moment of an orginator - editor
 */
public class Momento {

  private final String state;

  public Momento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }


}
