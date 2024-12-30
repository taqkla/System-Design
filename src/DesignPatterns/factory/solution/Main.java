package DesignPatterns.factory.solution;


/**
 * Factory Design Pattern: When there is super class and multiple subclasses, we want to get
 * object based on input and requirements.
 * Issues: Tight coupling with implementation.
 * Advantages: Focus on creating object for interface rather than implementation.
 * Loose coupling.
 */
public class Main {

  public static void main(String[] args) {
    Employee employee = EmployeeFactory.getEmployee("Android Developer");
    Employee webDeveloper = EmployeeFactory.getEmployee("Web Developer");
    System.out.println(employee.salary());
    System.out.println(webDeveloper.salary());
  }
}
