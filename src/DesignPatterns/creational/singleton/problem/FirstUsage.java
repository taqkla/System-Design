package DesignPatterns.creational.singleton.problem;

public class FirstUsage {

  private static Logger logger;

  public FirstUsage() {
    this.logger = new Logger(); // create an instance of an object
  }

  void use() {
    System.out.println(logger.hashCode());
    this.logger.printLogCount();
    this.logger.log("User Entry Created!");
    this.logger.printLogCount();
  }
}
