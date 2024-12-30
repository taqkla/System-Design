package DesignPrinciples.OpenClosedPrinciple.Bad;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(3.12);
    circle.draw();
  }
}
