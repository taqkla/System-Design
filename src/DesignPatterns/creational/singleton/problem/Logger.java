package DesignPatterns.creational.singleton.problem;

import java.util.ArrayList;

public class Logger {

  private ArrayList<String> logs; // in-memory storage
  private static Logger logger = new Logger(); // static singleton


  // Restrict the creation of object?
  private Logger() {
    this.logs = new ArrayList<>();
  }

  public static Logger getInstance() {
    // multithreading
    // lazy singleton
    // if (logger == null) {
    //   logger = new Logger();
    // }

    return logger; // creating this object everytime this method is called.
  }


  void log(String message) {
    this.logs.add(message);
    System.out.println(String.format("Logger: %s", message));
  }

  void printLogCount() {
    System.out.println(String.format("Logger: %s", this.logs.size()));
  }
}
