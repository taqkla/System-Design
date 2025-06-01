package DesignPrinciples.OpenClosedPrinciple.Good;


public abstract class Shape {

  private double area;

  public Shape(double area) {
    this.area = area;
  }


  // common code needed for all childs.
  public double getArea() {
    return area;
    // this logic is common to all childs.
  }

  // This method is abstract, so it must be implemented by all subclasses.
  public abstract void draw();
}




