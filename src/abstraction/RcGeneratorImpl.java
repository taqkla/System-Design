package abstraction;

public class RcGeneratorImpl extends RcGenerator {


  RcGeneratorImpl(int id, String name) {
    super(id, name);
  }

  @Override
  public String getName() {
    return "Prateek";
  }

  @Override
  public int getId() {
    return 0;
  }
}
