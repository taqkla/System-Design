package DesignPatterns.behavioural.chainofresponsibility.solution;

public class IssueLogger extends Logger {

  public IssueLogger() {
    this.level = 4; // Issue level
  }

  @Override
  protected void write(String message) {
    System.out.println("Issue: " + message);
  }
}
