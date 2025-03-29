package DesignPrinciples.OpenClosedPrinciple.Example2.Good;

public class FileInvoiceDao implements InvoiceDao {

  private String filePath;

  FileInvoiceDao(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void save() {
    System.out.println("Invoice is saved to file");
  }
}
