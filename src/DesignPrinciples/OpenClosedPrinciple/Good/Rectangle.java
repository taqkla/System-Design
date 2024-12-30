package DesignPrinciples.OpenClosedPrinciple.Good;

public class Rectangle extends Shape {

  public Rectangle(double area) {
    super(area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
}
