package DesignPrinciples.DependencyInversionPrinciple.Bad;


// request methods -- Http, tcp, ws, http2.0
public class HttpInvoiceRequester {

  private String request_methods;

  HttpInvoiceRequester() {
    this.request_methods = "HTTP";
  }

  public void requestItem(String item) {
    // ...
  }
}
