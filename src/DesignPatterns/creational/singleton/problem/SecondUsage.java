package DesignPatterns.creational.singleton.problem;

public class SecondUsage {

  private static Logger logger;

  public SecondUsage() {
    this.logger = new Logger();
  }

  void use() {
    System.out.println(logger.hashCode());
    /* logic */
    this.logger.printLogCount();
    this.logger.log("Post Entry Deleted!");
    this.logger.printLogCount();
    /* logic */
  }
}
