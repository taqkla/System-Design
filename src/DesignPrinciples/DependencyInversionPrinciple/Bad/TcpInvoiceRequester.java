package DesignPrinciples.DependencyInversionPrinciple.Bad;

public class TcpInvoiceRequester {

  private String request_methods;

  TcpInvoiceRequester() {
    this.request_methods = "TCP";
  }

  public void requestItem(String item) {
    // ...
  }
}
