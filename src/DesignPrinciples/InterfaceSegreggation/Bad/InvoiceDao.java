package DesignPrinciples.InterfaceSegreggation.Bad;


/**
 * **Interface Segregation Principle** A client should never be forced to implement an
 * interface/class that it doesn’t use, or clients shouldn’t be forced to depend on methods they do
 * not use.
 * Example: Imagine a TV remote control.A basic TV remote has buttons like power, volume,
 * and channel control.Now, imagine if this remote also had buttons for making coffee, opening your
 * garage, and feeding your pet.That would be overwhelming and confusing, right ? You'd have to
 * navigate through buttons you never use to find the ones you actually need. The Interface
 * Segregation Principle suggests that it's better to have specialised remotes for specialised
 * tasks.
 */
public class InvoiceDao implements Invoice {

  private String invoice;

  InvoiceDao(String invoice) {
    this.invoice = invoice;
  }

  @Override
  public void printInvoice() {
    // print the invoice
    // forced to implement this method
  }

  @Override
  public void SaveInvoice() {
// save the invoice.
  }

  @Override
  public int calculateTax() {
    // calculate the tax.
    // forced to implement this method
    return 0;
  }
}
