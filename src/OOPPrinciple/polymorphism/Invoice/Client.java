package OOPPrinciple.polymorphism.Invoice;

public class Client {

  public static void main(String[] args) {
    InvoiceStore invoiceStore = new DbInvoiceStore();
    invoiceStore.save();
  }

}
