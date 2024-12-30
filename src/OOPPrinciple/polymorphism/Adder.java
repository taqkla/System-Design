package OOPPrinciple.polymorphism;

class Calculator {

  /**
   * Function overloading : Polymorphism enables us to define methods with same
   * name and different params in same class.
   * Function Overloading - Static polymorphism
   *
   */
  int sum(int a, int b) {
    return a + b;
  }

  int sum(int a, int b, int c) {
    return a + b + c;
  }
}

public class Adder {


  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.sum(1, 2, 3));
    System.out.println(calculator.sum(1, 2));
  }
}

// Compile -- machine code
//
//
// Run -- machine code.

