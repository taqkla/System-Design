package DesignPrinciples.BookMyShow;


class BookingV2 {

  private final UserV2 user;
  private final int showtime;
  private final int seats;

  BookingV2(UserV2 userId, int showtime, int seats) {
    this.user = userId;
    this.showtime = showtime;
    this.seats = seats;
  }

  void generateTicket() {
    // Logic to generate a ticket
  }

  // Methods related to booking and ticket generation
}

class UserV2 {

  private final String name;
  private final String email;

  UserV2(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // Methods related to user information (e.g., getters and setters)
}


// Extension through inheritance
class VIPBooking extends BookingV2 {

  private final int extras;

  VIPBooking(UserV2 user, int showtime, int seats, int extras) {
    super(user, showtime, seats);
    this.extras = extras;
  }

  // Override the generateTicket method to add extra information
  void generateTicket() {
    // Generate a VIP ticket with extras
  }
}



public class OcpBookMyShow {


}