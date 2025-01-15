package DesignPrinciples.LiskovSubstitutionPrinciple.Bad;

public class DatabaseConnection extends Invoice{


  public DatabaseConnection(DatabaseConnection databaseConnection, String filePath) {
    super(databaseConnection, filePath);
  }

  @Override
  public void save() {
    throw new UnsupportedOperationException("Not supported!");
  }
}
