package DesignPrinciples.LiskovSubstitutionPrinciple.Bad;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Invoice> invoiceList = List.of(new DatabaseConnection(null, null), new InvoicePrinter(null, null));

    invoiceList.forEach(invoice -> invoice.save());


    // Invoice can be replaced with InvoicePrinter
  }

}
