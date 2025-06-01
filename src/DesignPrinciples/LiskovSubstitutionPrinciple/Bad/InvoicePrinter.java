package DesignPrinciples.LiskovSubstitutionPrinciple.Bad;

public class InvoicePrinter extends Invoice {

  public InvoicePrinter(DatabaseConnection databaseConnection, String filePath) {
    super(databaseConnection, filePath);
  }

  @Override
  public void save() {
    throw new RuntimeException("Save capability is not supported");
  }

}

// InvoicePrinter is not providing the capability to save.
