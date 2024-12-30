package DesignPrinciples.LiskovSubstitutionPrinciple.Good;

public class Main {

  public static void main(String[] args) {



    InvoiceDao invoice1 = new FileInvoiceDao(); // Child class object can be substituted with breaking the correctness of th code.
    InvoiceDao invoice2 = new DatabaseInvoiceDao();

    invoice1.save();
    invoice2.save();

  }
}
