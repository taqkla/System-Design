package DesignPrinciples.OpenClosedPrinciple.Good;

public class Hexagon extends Shape {

  public Hexagon(double area) {
    super(area);
  }

  @Override
  public void draw() {
    System.out.println("Implementing area calculation for hexagon!");
  }
}
