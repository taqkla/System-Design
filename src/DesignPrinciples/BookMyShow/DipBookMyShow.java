package DesignPrinciples.BookMyShow;

public class DipBookMyShow {

}

// 5. Dependency Inversion Principle(DIP):

// ** DIP states that high - level modules should not depend on low - level modules.Both should depend on abstractions.**

// In JavaScript, you can achieve DIP by using dependency injection, which allows you to inject dependencies(e.g. entities, services) into a class instead of creating them directly inside the class.


// High Level Module
class BookingService {

  private final ShowTimeService showtimeService; // High Level Module

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

interface ShowTimeService {

  int findShowtime(String movieTitle, String theater, int startTime);
}

class PvrShowTimeService implements ShowTimeService {

  @Override
  public int findShowtime(String movieTitle, String theater, int startTime) {
    // fetch showtime from DB
    return 0;
  }
}


class ImaxShowTimeService implements ShowTimeService {

  @Override
  public int findShowtime(String movieTitle, String theater, int startTime) {
    // fetch showtime from third party library
    return 0;
  }
}

class TheatreShowTimeService implements ShowTimeService {

  @Override
  public int findShowtime(String movieTitle, String theater, int startTime) {
    // fetch showtime from third party library
    return 0;
  }
}

// In this example, the`BookingService` depends on the`showtimeService`, but the `showtimeService` is an abstraction that can be implemented differently(e.g., with a database or an API). This allows for flexibility and adheres to the Dependency Inversion Principle.