package DesignPrinciples.OpenClosedPrinciple.Good;


public class Triangle extends Shape {

  public Triangle(double area) {
    super(area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a triangle");
  }
}
