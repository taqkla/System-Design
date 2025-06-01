package DesignPrinciples.BookMyShow;

/**
 * 3. Liskov Substitution Principle(LSP):
 *
 * ** LSP states that objects of a superclass should be able to be replaced with objects of a
 * subclass without affecting the correctness of the program.**
 *
 * In our example, you should be able to use a `VIPBooking` object wherever you use a `Booking`
 * object without causing issues.
 */
public class LspBookMyShow {

  public static void main(String[] args) {
    UserV2 user1 = new UserV2("Prateek", "abcd@gmail.com");
    UserV2 user2 = new UserV2("Vaibhav", "abcd@gmail.com");
    BookingV2 regularBooking = new BookingV2(user1, 1, 1); // --- working file
    BookingV2 vipBooking = new VIPBooking(user2, 1, 1, 1); // adding this line, code should work correctly;

    regularBooking.generateBooking();
    vipBooking.generateBooking();
  }
}
