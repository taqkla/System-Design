package DesignPrinciples.LiskovSubstitutionPrinciple.Good;

public class DatabaseInvoiceDao extends InvoiceDao {

  @Override
  public void save() {
    System.out.println("Saving invoice in DB!");
  }
}
