package DesignPatterns.behavioural.chainofresponsibility.solution;

public class Main {

  public static void main(String[] args) {
    // Create loggers
    Logger logger = LoggerWithChainOfResponsibility.createLoggerWithChainOfCommand();

    // Log messages
    // logger.logMessage(1, "This is an info message.");
    // logger.logMessage(2, "This is a warning message.");
    // // logger.logMessage(3, "This is an error message.");
    // logger.logMessage(4, "This is a panic message!");

    logger.logMessage(5, "This is a high severity logger");

  }

}
