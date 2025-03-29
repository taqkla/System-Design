package DesignPrinciples.InterfaceSegreggation.Good;

public class InvoiceSaveAndPrint implements InvoicePrinter, InvoiceDao{

  @Override
  public void save() {

  }

  @Override
  public void printInvoice() {

  }
}
