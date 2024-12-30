package DesignPrinciples.InterfaceSegreggation.Bad;

public interface Invoice {
   void printInvoice();
   void SaveInvoice();
   int calculateTax();
}
