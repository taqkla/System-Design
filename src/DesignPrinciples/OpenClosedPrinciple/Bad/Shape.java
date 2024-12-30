package DesignPrinciples.OpenClosedPrinciple.Bad;

/**
 * This example violates the OCP because the draw() method is not open for extension, but need
 * modification. If we want to support a new shape type, such as a triangle, we have to modify the
 * draw() function. This makes the code more difficult to maintain and test.
 */
public class Shape {

  private final double area;

  public Shape(double area) {
    this.area = area;
  }

  public double getArea() {
    return area;
  }

  // This method violates the OCP because we have to add a new conditional statement for every new shape type we want to support.
  public void draw() {
    if (this instanceof Rectangle) {
      System.out.println("Drawing a rectangle");
    } else if (this instanceof Circle) {
      System.out.println("Drawing a circle");
    } else if (this instanceof Triangle) {
      System.out.println("Drawing a Triangle");
    } else {
      throw new Error("Unsupported shape type");
    }
  }
}
