package DesignPrinciples.OpenClosedPrinciple.Example2.Good;

public class Main {

  public static void main(String[] args) {
    InvoiceDao dao = new FileInvoiceDao();
    dao.save();
  }

}
