package DesignPatterns.behavioural.chainofresponsibility.solution;

class ErrorLogger extends Logger {

  public ErrorLogger() {
    this.level = 3; // Error level
  }

  @Override
  protected void write(String message) {
    System.out.println("Error: " + message);
  }
}
