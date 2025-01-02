package DesignPatterns.creational.factory.solution;

public class EmployeeFactory {

  public static Employee getEmployee(String type) {
    if (type.equals("Android Developer")) {
      return new AndroidDeveloper();
    } else if(type.equals("Web Developer")) {
      return new WebDeveloper();
    }
    return new WebDeveloper();
  }
}
