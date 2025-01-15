package DesignPrinciples.DependencyInversionPrinciple.Bad;

public class WsInvoiceRequester {

  private String request_methods;

  WsInvoiceRequester() {
    this.request_methods = "WS";
  }

  public void requestItem(String item) {
    // ...
  }
}
