package DesignPatterns.creational.singleton.problem;

public class FirstUsage {

  private static Logger logger;

  public FirstUsage() {
    this.logger = Logger.getInstance(); // create an instance of an object
  }

  void use() {
    this.logger.printLogCount();
    this.logger.log("User Entry Created!");
    this.logger.printLogCount();
  }
}
