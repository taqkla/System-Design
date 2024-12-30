package DesignPrinciples.DependencyInversionPrinciple.Bad;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    InvoiceTracker badInvoiceTracker = new InvoiceTracker(List.of("Apple", "Banana")); // always sent you http based invoice
    badInvoiceTracker.requestItems();
  }
}
