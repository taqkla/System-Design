package DesignPrinciples.OpenClosedPrinciple.Example2.Good;

import DesignPrinciples.LiskovSubstitutionPrinciple.Bad.DatabaseConnection;

public class DatabaseInvoiceDao implements InvoiceDao {

  private DatabaseConnection databaseConnection;

  DatabaseInvoiceDao(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  @Override
  public void save() {
    System.out.println("Invoice is saved to Database");
  }
}
