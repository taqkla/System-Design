package DesignPrinciples.DependencyInversionPrinciple.Good;

public class WsInvoiceRequester implements InvoiceRequester {

  private String request_method;

  public WsInvoiceRequester() {
    this.request_method = "WS";
  }

  @Override
  public void requestItem(String item) {
    //
  }
}
