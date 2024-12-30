package DesignPrinciples.DependencyInversionPrinciple.Bad;


// request methods -- Http, tcp, ws, http2.0
public class InvoiceRequester {

  private String request_methods;

  InvoiceRequester() {
    this.request_methods = "HTTP";
  }

  public void requestItem(String item) {
    // ...
  }
}
