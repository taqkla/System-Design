package DesignPrinciples.LiskovSubstitutionPrinciple.Bad;

/**
 * If class B is a subtype of Class A, then we should be able to replace the object of A with B
 * without breaking the behaviour of the program.
 * A a = new A(); ---> A a = new B();
 * Subclass should extend the capability of parent class not narrow it down.
 *
 * BankAccount: Imagine a parking lot that can accommodate regular cars.Now, if you replace a regular
 * car with an electric car, the parking lot should still function correctly. The electric car
 * should be able to fit into the parking space, and the parking lot should be able to provide a
 * charging station.If replacing a regular car with an electric car breaks the parking lot's
 * functionality (e.g., no charging stations), then the parking lot is not adhering to the Liskov
 * Substitution Principle.
 * ParkingLot lot = new RegularParkingLot();
 * ParkingLot lot = new ElectricParkingLot();
 */
public class Invoice {

  private final DatabaseConnection databaseConnection;
  private final String filePath;


  public Invoice(DatabaseConnection databaseConnection, String filePath) {
    this.databaseConnection = databaseConnection;
    this.filePath = filePath;
  }

  public void save() {
    // save to db or file based on some params.
  }
}
