package OOPPrinciple.inheritance.Example2;

public class client {

  public static void main(String[] args) {
     Creta creta = new Creta();
     creta.getCompany();
     Car car = new Creta();
  }
}

// Inherit a class - inherit not only properties but behaviour(methods) as well

// C ---> A and B and both A and B has some implemented method getName()


// Interface - inherit the definition of the behaviour.

// C ---> A and B and both A and B has some method definition as getName()
// C will implement getName() - single implementation of getName()
// C.getName()
