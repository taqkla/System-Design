package DesignPatterns.factory.solution;

public class EmployeeFactory {

  public static Employee getEmployee(String type) {
    if (type.equals("Android Developer")) {
      return new AndroidDeveloper();
    }
    return new WebDeveloper();
  }
}
