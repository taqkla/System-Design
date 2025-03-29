package DesignPrinciples.OpenClosedPrinciple.Example2.Good;


import DesignPrinciples.LiskovSubstitutionPrinciple.Bad.DatabaseConnection;

public class Main {

  public static void main(String[] args) {
    InvoiceDao dao = new FileInvoiceDao("/temp/data/");
    // DatabaseConnection connection = new DatabaseConnection(type: http, dbType:sql);
    DatabaseInvoiceDao invoiceDao = new DatabaseInvoiceDao(new DatabaseConnection(null, ""));
    dao.save();
  }

}
