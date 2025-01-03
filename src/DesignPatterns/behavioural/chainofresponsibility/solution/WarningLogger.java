package DesignPatterns.behavioural.chainofresponsibility.solution;

class WarningLogger extends Logger {

  public WarningLogger() {
    this.level = 2; // Warning level
  }

  @Override
  protected void write(String message) {
    System.out.println("Warning: " + message);
  }
}
