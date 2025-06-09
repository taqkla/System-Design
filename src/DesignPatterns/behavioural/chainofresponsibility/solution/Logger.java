package DesignPatterns.behavioural.chainofresponsibility.solution;

abstract class Logger {

  protected int level;
  protected Logger nextLogger;

  public void setNextLogger(Logger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void logMessage(int level, String message) {
    if (this.level
        == level) { // (InfoLogger)this.level = 1, level = 3 ----> (WarningLogger)this.level = 2, level = 3 --> (ErrorLogger)this.level = 3, level = 3
      write(message);
      return;
    }
    if (nextLogger != null) {
      // Ask the next logger to handle this request.
      nextLogger.logMessage(level, message);
    }
  }

  protected abstract void write(String message);
}

