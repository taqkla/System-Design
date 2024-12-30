package DesignPrinciples.OpenClosedPrinciple.Good;

import DesignPrinciples.OpenClosedPrinciple.Bad.Shape;

public class Parallelogram extends Shape {

  public Parallelogram(double area) {
    super(area);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
}
