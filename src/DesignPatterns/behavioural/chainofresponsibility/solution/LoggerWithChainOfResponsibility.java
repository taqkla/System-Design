package DesignPatterns.behavioural.chainofresponsibility.solution;

public class LoggerWithChainOfResponsibility {

  public static Logger createLoggerWithChainOfCommand() {
    Logger logger = new InfoLogger();
    Logger warningLogger = new WarningLogger();
    Logger errorLogger = new ErrorLogger();
    Logger issueLogger = new IssueLogger();

    // Set up the chain of responsibility
    logger.setNextLogger(warningLogger);
    warningLogger.setNextLogger(errorLogger);
    errorLogger.setNextLogger(issueLogger);
    issueLogger.setNextLogger(new HighSeverityLogger());
    return logger;

    // Logger = InfoLogger ---> nextLogger = Warning Logger ---> nextLogger =  ErrorLogger ---> nextLogger =  IssueLogger
  }

}
