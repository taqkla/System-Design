package DesignPrinciples.BookMyShow;

public class SrpBookMyShow {

}


/**
 * Single Responsibility Principle(SRP): ** SRP states that a class should have only one reason to
 * change.**
 */
class Movie {

  private final String title;
  private final int duration;
  private final String genre;


  Movie(String title, int duration, String genre) {
    this.title = title;
    this.duration = duration;
    this.genre = genre;
  }

  // Methods related to movie information (e.g., getters and setters)
}

class Showtime {

  private final String movie;
  private final int theaterId;
  private final int startTime;

  Showtime(String movie, int theaterId, int startTime) {
    this.movie = movie;
    this.theaterId = theaterId;
    this.startTime = startTime;
  }

  // Methods related to showtime information (e.g., getters and setters)
}

class Booking {

  private final User user;
  private final int showtime;
  private final int seats;

  Booking(User userId, int showtime, int seats) {
    this.user = userId;
    this.showtime = showtime;
    this.seats = seats;
  }

  // Methods related to booking and ticket generation
}

class User {

  private final String name;
  private final String email;

  User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  // Methods related to user information (e.g., getters and setters)
}
