package DesignPatterns.singleton.problem;

public class SecondUsage {

  private Logger logger;

  public SecondUsage() {
    this.logger = new Logger();
  }

  void use() {
    /* logic */
    this.logger.printLogCount();
    this.logger.log("Post Entry Deleted!");
    this.logger.printLogCount();
    /* logic */
  }
}
