package DesignPatterns.creational.factory.problem;


/**
 * Factory Design Pattern: When there is super class and multiple subclasses and we want to get
 * object based on input and requirements.
 * Issues: Tight coupling with implementation.
 *
 * If client need to know about how the object is created, it's a tight coupling.
 */
public class Main {

  public static void main(String[] args) {
    Employee androidDeveloper = new AndroidEngineer();
    System.out.println(androidDeveloper.name() + " : " + androidDeveloper.salary());

    Employee webDeveloper = new WebDeveloper();
    System.out.println(webDeveloper.name() + " : " +webDeveloper.salary());
  }
}


