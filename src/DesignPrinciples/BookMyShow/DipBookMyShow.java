package DesignPrinciples.BookMyShow;

public class DipBookMyShow {

}

// 5. Dependency Inversion Principle(DIP):

// ** DIP states that high - level modules should not depend on low - level modules.Both should depend on abstractions.**

// In JavaScript, you can achieve DIP by using dependency injection, which allows you to inject dependencies(e.g. entities, services) into a class instead of creating them directly inside the class.


class BookingService {

  private final ShowTimeService showtimeService;

  BookingService(ShowTimeService showtimeService) {
    this.showtimeService = showtimeService;
  }

  Booking bookShowtime(User user, String movieTitle, String theater, int startTime, int seats) {
    int showtime = this.showtimeService.findShowtime(movieTitle, theater, startTime);
    if (showtime != -1) {
      return new Booking(user, showtime, seats);
    } else {
      return null; // Showtime not found
    }
  }
}

class ShowTimeService {

  int findShowtime(String movieTitle, String theater, int startTime) {
    // write logic to find showtime.
    return 0;
  }
}

// In this example, the`BookingService` depends on the`showtimeService`, but the `showtimeService` is an abstraction that can be implemented differently(e.g., with a database or an API). This allows for flexibility and adheres to the Dependency Inversion Principle.