package DesignPrinciples.OpenClosedPrinciple.Example2.Good;

import java.util.ArrayList;
import java.util.List;

public class InmemoryInvoiceDao implements InvoiceDao {

  private List<String> invoices;

  InmemoryInvoiceDao() {
    this.invoices = new ArrayList<>();
  }
  @Override
  public void save() {
    this.invoices.add("Invoice 1");
  }
}
