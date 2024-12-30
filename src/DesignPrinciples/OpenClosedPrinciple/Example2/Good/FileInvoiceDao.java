package DesignPrinciples.OpenClosedPrinciple.Example2.Good;

public class FileInvoiceDao implements InvoiceDao {

  @Override
  public void save() {
    System.out.println("Invoice is saved to file");
  }
}
