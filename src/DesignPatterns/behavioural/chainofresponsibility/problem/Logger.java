package DesignPatterns.behavioural.chainofresponsibility.problem;

public class Logger {

  public static void logMessage(int level, String message) {
    if (level == 1) {
      System.out.println("Info: " + message);
    } else if (level == 2) {
      System.out.println("Warning: " + message);
    } else {
      System.out.println("Error: " + message);
    }
  }

}
