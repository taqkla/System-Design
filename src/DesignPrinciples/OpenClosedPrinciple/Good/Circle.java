package DesignPrinciples.OpenClosedPrinciple.Good;

public class Circle extends Shape {

  public Circle(double area) {
    super(area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }
}