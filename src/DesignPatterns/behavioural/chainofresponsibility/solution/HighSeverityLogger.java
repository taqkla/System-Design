package DesignPatterns.behavioural.chainofresponsibility.solution;

public class HighSeverityLogger extends Logger {

  public HighSeverityLogger() {
    this.level = 5;
  }

  @Override
  protected void write(String message) {
    System.out.println("High Severity: " + message);
  }
}
