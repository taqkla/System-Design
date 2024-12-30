package DesignPrinciples.OpenClosedPrinciple.Good;

/**
 * we have made the draw() method abstract. This means that it must be implemented by all subclasses
 * of the Shape class. This makes the code more open for extension, because we can add new shape
 * types without having to modify the Shape class itself.
 */
public abstract class Shape {

  private double area;

  public Shape(double area) {
    this.area = area;
  }

  public double getArea() {
    return area;
    // this logic is common to all childs.
  }

  // This method is abstract, so it must be implemented by all subclasses.
  public abstract void draw();
}

