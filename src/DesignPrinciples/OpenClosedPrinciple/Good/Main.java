package DesignPrinciples.OpenClosedPrinciple.Good;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(3.12);
    circle.draw();
  }
}


// Abstract class - if you need some logic which should be common to all childs, use abstract class.


// Interface -- Multiple Inheritance
