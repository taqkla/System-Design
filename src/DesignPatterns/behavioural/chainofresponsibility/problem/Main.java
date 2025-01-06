package DesignPatterns.behavioural.chainofresponsibility.problem;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain
 * of handlers. Upon receiving a request, each handler decides either to process the request or to
 * pass it to the next handler in the chain.
 */
public class Main {


  // logger.Info()
  // logger.Warning()
  // logger.Error()

  public static void main(String[] args) {
    Logger.logMessage(1, "This is an log");
    Logger.logMessage(2, "This is an log");
    Logger.logMessage(3, "This is an log");
  }

}
