package OOPPrinciple.polymorphism;


interface Shape {

  double getArea();
}

class Rectangle implements Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }


  public double getArea() {
    return this.length * this.width;
  }
}


class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return 3.13 * this.radius * this.radius;
  }
}

public class DynamicPolymorphism {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(2.0);
    shapes[1] = new Rectangle(2.0, 3.0);

    System.out.println("The area of circle is: " + shapes[0].getArea());
    System.out.println("The area of rectangle is: " + shapes[1].getArea());
  }
}
