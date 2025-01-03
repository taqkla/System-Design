package DesignPatterns.behavioural.chainofresponsibility.solution;

class InfoLogger extends Logger {

  public InfoLogger() {
    this.level = 1; // Info level
  }

  @Override
  protected void write(String message) {
    System.out.println("Info: " + message);
  }
}
