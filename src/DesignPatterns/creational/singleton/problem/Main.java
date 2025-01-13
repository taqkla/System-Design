package DesignPatterns.creational.singleton.problem;

/**
 * The Singleton pattern ensures that a class has only one instance and provides a global point of
 * access to that instance. This pattern is beneficial when you need to control access to a shared
 * resource, such as a Configuration object or a connection pool. By ensuring that only one instance
 * of the class exists, you avoid issues caused by multiple instances and ensure consistent behavior
 * across the application.
 */
public class Main {

  public static void main(String[] args) {
    FirstUsage usage1 = new FirstUsage();
    SecondUsage usage2 = new SecondUsage();

    usage1.use();
    usage2.use();

  }
}
