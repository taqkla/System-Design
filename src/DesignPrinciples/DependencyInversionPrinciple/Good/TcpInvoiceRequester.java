package DesignPrinciples.DependencyInversionPrinciple.Good;

public class TcpInvoiceRequester implements InvoiceRequester {

  private String request_methods;

  TcpInvoiceRequester() {
    this.request_methods = "TCP";
  }
  @Override
  public void requestItem(String item) {

  }
}
