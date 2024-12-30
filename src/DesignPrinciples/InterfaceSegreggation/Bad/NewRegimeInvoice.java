package DesignPrinciples.InterfaceSegreggation.Bad;

public class NewRegimeInvoice implements Invoice {

  @Override
  public void printInvoice() {

  }

  @Override
  public void SaveInvoice() {

  }

  @Override
  public int calculateTax() {
    return 0;
  }
}
