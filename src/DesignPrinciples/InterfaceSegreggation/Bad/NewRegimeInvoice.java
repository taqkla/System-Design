package DesignPrinciples.InterfaceSegreggation.Bad;

public class NewRegimeInvoice implements Invoice {

  @Override
  public void printInvoice() {
    // print the invoice
    // forced to implement this method
  }

  @Override
  public void SaveInvoice() {
    // save the invoice
    // forced to implement this method
  }

  @Override
  public int calculateTax() {
    return 0;
  }
}
