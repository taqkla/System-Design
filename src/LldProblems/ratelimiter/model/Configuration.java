package LldProblems.ratelimiter.model;

/**
 * Use Builder Pattern here to add the configuration corresponding to all the possible rate limiting
 * algorithms.
 */
public class Configuration {

  int capacity;
  String service;
  int id;

  public Configuration(int capacity, String service, int id) {
    this.capacity = capacity;
    this.service = service;
    this.id = id;
  }

  public int getCapacity() {
    return capacity;
  }

  public String getService() {
    return service;
  }

  public int getId() {
    return id;
  }
}
