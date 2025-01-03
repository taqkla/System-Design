package DesignPatterns.behavioural.chainofresponsibility.solution;

public class Main {

  public static void main(String[] args) {
    // Create loggers
    Logger infoLogger = new InfoLogger();
    Logger warningLogger = new WarningLogger();
    Logger errorLogger = new ErrorLogger();

    // Set up the chain of responsibility
    infoLogger.setNextLogger(warningLogger);
    warningLogger.setNextLogger(errorLogger);

    // Log messages
    infoLogger.logMessage(1, "This is an info message.");
    infoLogger.logMessage(2, "This is a warning message.");
    infoLogger.logMessage(3, "This is an error message.");

  }

}
