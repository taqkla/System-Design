package DesignPrinciples.OpenClosedPrinciple.Bad;


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
