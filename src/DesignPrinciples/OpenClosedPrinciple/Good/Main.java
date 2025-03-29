package DesignPrinciples.OpenClosedPrinciple.Good;

/**
 * we have made the draw() method abstract. This means that it must be implemented by all subclasses
 * of the Shape class. This makes the code more open for extension, because we can add new shape
 * types without having to modify the Shape class itself.
 */
public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(3.12);
    circle.draw();
    Shape hexgon = new Hexagon(3.12);
    hexgon.getArea();
    hexgon.draw();
  }
}

// Abstract class - if you need some logic which should be common to all childs, use abstract class.

// Interface -- Multiple Inheritance
