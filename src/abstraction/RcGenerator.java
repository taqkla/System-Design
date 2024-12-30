package abstraction;

public abstract class RcGenerator {

  private int id;
  private String name;

  RcGenerator(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public abstract String getName();

  public abstract int getId();

  public void printData() {
    System.out.println("This is a nice class but abstract one.");
  }
}
