package DesignPrinciples.OpenClosedPrinciple.Bad;

/**
 * This example violates the OCP because the draw() method is not open for extension, but need
 * modification. If we want to support a new shape type, such as a triangle, we have to modify the
 * draw() function. This makes the code more difficult to maintain and test.
 */
public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(3.12);
    circle.draw();
  }
}
