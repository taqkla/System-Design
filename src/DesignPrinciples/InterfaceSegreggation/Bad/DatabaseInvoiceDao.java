package DesignPrinciples.InterfaceSegreggation.Bad;

public class DatabaseInvoiceDao implements Invoice {

  @Override
  public void printInvoice() {
     // this behaviour is not of use
  }

  @Override
  public void SaveInvoice() {
     // this is of use for this class
  }

  @Override
  public int calculateTax() {
    // this behaviour is not of use
    return 0;
  }
}
