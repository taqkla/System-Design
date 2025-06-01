package DesignPatterns.creational.singleton.solution;

import java.util.ArrayList;

public class Logger {

  private ArrayList<String> logs;
  private static Logger logger;
  // private static Logger logger = new Logger(); // static singleton -- eager singleton


  private Logger() {
    this.logs = new ArrayList<>();
  }


  // t1, t2, t4....  - time0
  public static Logger getLogger() {
    // return logger;
    // lazy singleton
    // 100 lines of code here.

    // t1, t2, t4....  - time1
    if (logger == null) {
      // user and post class objects will try to execute this line at the same time using different threads.
      // t1, t2, t4....  - time2
      synchronized (Logger.class) {
        if (logger == null) {
          logger = new Logger();
        }
      }
    }
    // 100 lines of code here.
    return logger;

  }

  void log(String message) {
    this.logs.add(message);
    System.out.println(String.format("Logger: %s", message));
  }

  void printLogCount() {
    System.out.println(String.format("Logger: %s", this.logs.size()));
  }
}
