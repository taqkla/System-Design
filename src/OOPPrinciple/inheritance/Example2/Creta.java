package OOPPrinciple.inheritance.Example2;

public class Creta implements Car, Sedan {



  public Creta() {

  }

  @Override
  public String getCompany() {
    return "Honda";
  }

  @Override
  public String getModelName() {
    return "V1";
  }

  @Override
  public String getEngineType() {
    return "Electric";
  }
}

