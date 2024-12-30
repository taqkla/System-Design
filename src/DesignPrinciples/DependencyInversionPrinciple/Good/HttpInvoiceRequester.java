package DesignPrinciples.DependencyInversionPrinciple.Good;

public class HttpInvoiceRequester implements InvoiceRequester {

  private String request_methods;

  HttpInvoiceRequester() {
    this.request_methods = "HTTP";
  }

  public void requestItem(String item) {
    // ...
  }
}
