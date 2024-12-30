package DesignPatterns.singleton.problem;

public class SecondUsage {

  private static Logger logger;

  public SecondUsage() {
    this.logger = Logger.getInstance();
  }

  void use() {
    /* logic */
    this.logger.printLogCount();
    this.logger.log("Post Entry Deleted!");
    this.logger.printLogCount();
    /* logic */
  }
}
