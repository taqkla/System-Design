package DesignPrinciples.DependencyInversionPrinciple.Good;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    InvoiceRequester invoiceRequester = new HttpInvoiceRequester();
    InvoiceTracker invoiceTracker = new InvoiceTracker(
        List.of("Apple", "Banana"), invoiceRequester); // always sent you http based invoice
    InvoiceTracker invoiceTracker2 = new InvoiceTracker(
        List.of("Apple", "Banana"), new WsInvoiceRequester());
    invoiceTracker.requestItems();
    invoiceTracker2.requestItems();

    InvoiceTracker invoiceTracker3 = new InvoiceTracker(List.of("Apple", "Banana"), new TcpInvoiceRequester());
    invoiceTracker3.requestItems();
  }
}
