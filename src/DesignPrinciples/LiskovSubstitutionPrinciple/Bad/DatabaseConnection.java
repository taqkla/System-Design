package DesignPrinciples.LiskovSubstitutionPrinciple.Bad;

public class DatabaseConnection extends Invoice{


  public DatabaseConnection(DatabaseConnection databaseConnection, String filePath) {
    super(databaseConnection, filePath);
  }

  @Override
  public void save() {
    System.out.println("Saved to DB");
  }
}

// DatabaseDao and Invoice both class provide save capability..
