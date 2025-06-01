package DesignPrinciples.DependencyInversionPrinciple.Bad;

import java.util.List;

public class InvoiceTracker {


  private final List<String> items;
  private final HttpInvoiceRequester requester; // http invoice will be sent.
  private final WsInvoiceRequester wsRequester;

  private final TcpInvoiceRequester tcpInvoiceRequester;

  InvoiceTracker(List<String> items) {
    this.items = items;

    // BAD: We have created a dependency on a specific request implementation.
    // We should just have requestItems depend on a request method: `request`
    this.requester = new HttpInvoiceRequester();
    this.wsRequester = new WsInvoiceRequester();
    this.tcpInvoiceRequester = new TcpInvoiceRequester();

  }

  public void requestItems() {
    this.items.forEach(item -> this.requester.requestItem(item));
  }
}
