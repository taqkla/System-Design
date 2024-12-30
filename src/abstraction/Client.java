package abstraction;

public class Client {

  public static void main(String[] args) {
    RcGenerator rcGenerator = new RcGeneratorImpl(0, "Prateek");
    System.out.println(rcGenerator.getId());
    System.out.println(rcGenerator.getName());
    rcGenerator.printData();
  }
}
