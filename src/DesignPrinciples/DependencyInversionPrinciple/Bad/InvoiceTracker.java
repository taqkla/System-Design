package DesignPrinciples.DependencyInversionPrinciple.Bad;

import java.util.List;

public class InvoiceTracker {


  private final List<String> items;
  private final InvoiceRequester requester; // http invoice will be sent.

  InvoiceTracker(List<String> items) {
    this.items = items;

    // BAD: We have created a dependency on a specific request implementation.
    // We should just have requestItems depend on a request method: `request`
    this.requester = new InvoiceRequester();

  }

  public void requestItems() {
    this.items.forEach(item -> this.requester.requestItem(item));
  }
}
