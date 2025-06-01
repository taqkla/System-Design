package DesignPrinciples.OpenClosedPrinciple.Example2.Bad;

// Voilates both SRP and OCP.
// Save the invoice.
public class InvoiceDao {

  private String /*Invoice */ invoice;
  private String /*DatabaseConnection*/ databaseConnection;

  private String filePath;

  public InvoiceDao(String invoice, String databaseConnection, String filePath) {
    this.invoice = invoice;
    this.databaseConnection = databaseConnection;
    this.filePath = filePath;
  }

  void saveToDb() {
  }

  void saveToFile() {

  }
}
