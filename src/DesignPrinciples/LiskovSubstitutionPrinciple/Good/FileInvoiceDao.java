package DesignPrinciples.LiskovSubstitutionPrinciple.Good;

public class FileInvoiceDao extends InvoiceDao {

  @Override
  public void save() {

    // throw NotSupportedException();
    System.out.println("Saving invoice to File!");
  }
}
