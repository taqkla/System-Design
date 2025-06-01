package DesignPrinciples.BookMyShow;

public class IspBookMyShow {

}

/**
 * Interface Segregation Principle(ISP): ** ISP states that no client should be forced to depend on
 * methods it does not use.**
 */

// Instead of a monolithic interface
class BookingV3 {

  // private final User user;
  // private final int showtime;
  // private final int seats;
  //
  // BookingV3(User user, int showtime, int seats) {
  //   this.user = user;
  //   this.showtime = showtime;
  //   this.seats = seats;
  // }

  void generateTicket() {
    // Logic to generate a ticket
  }

  void cancelBooking() {
    // Logic to cancel a booking
  }

  void findShowTime() {
    // logic to find showtime;
  }
}

// Wrong interface
interface BadBooking {
 void generateBooking();
  void cancelBooking();
  void findShowTime();
}


// Better Interface
interface IspBooking {
  void generateBooking();
  void cancelBooking();
}

interface showTimeService {
  void findShowTime();
}


/**
 * By splitting the monolithic `Booking` class into smaller classes, each with a specific
 * responsibility, you avoid forcing clients to depend on methods they don't use.
 */
// Split into multiple smaller interfaces
class Ticket {

  private final User user;
  private final int showtime;
  private final int seats;

  Ticket(User user, int showtime, int seats) {
    this.user = user;
    this.showtime = showtime;
    this.seats = seats;
  }

  void generateTicket() {
    // Logic to generate a ticket
  }
}

class Cancellation {

  Cancellation() {

  }

  void cancelBooking() {
    // Logic to cancel a booking
  }
}