package DesignPatterns.singleton.problem;

public class FirstUsage {

  private Logger logger;

  public FirstUsage() {
    this.logger = new Logger();
  }

  void use() {
    this.logger.printLogCount();
    this.logger.log("User Entry Created!");
    this.logger.printLogCount();
  }
}
