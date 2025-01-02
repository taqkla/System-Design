package DesignPatterns.creational.singleton.solution;


public class Main {

  public static void main(String[] args) {
    FirstUsage usage1 = new FirstUsage();
    SecondUsage usage2 = new SecondUsage();

    usage1.use();
    usage2.use();
  }
}
