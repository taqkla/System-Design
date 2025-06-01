package DesignPrinciples.DependencyInversionPrinciple.Good;

import java.util.List;

public class InvoiceTracker {

  private final List<String> items;
  private final InvoiceRequester requester; // http based, ws based


  // decoupled - client can send any type of requester to track the invoice.
  // Invoice tracker don't care about the internal details of requester.
  InvoiceTracker(List<String> items, InvoiceRequester requester) {
    this.items = items;
    this.requester = requester;
  }

  public void requestItems() {
    this.items.forEach(item -> this.requester.requestItem(item));
  }

}


