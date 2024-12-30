package DesignPrinciples.DependencyInversionPrinciple.Good;

import java.util.List;

public class InvoiceTracker {

  private final List<String> items;
  private final InvoiceRequester requester;

  InvoiceTracker(List<String> items, InvoiceRequester requester) {
    this.items = items;
    this.requester = requester;
  }

  public void requestItems() {
    this.items.forEach(item -> this.requester.requestItem(item));
  }

}


