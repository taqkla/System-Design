package DesignPatterns.behavioural.observer.problem;

public class Client {

  public static void main(String[] args) {
    // Subject
    YoutubeChannel channel1 = new YoutubeChannel("SportsTak.");

    // Observers
    Subscriber subscriber1 = new Subscriber("Mohit");
    Subscriber subscriber3 = new Subscriber("Dhoni");
    Subscriber subscriber4 = new Subscriber("Deepak");
    channel1.subscribe(subscriber1);
    channel1.subscribe(subscriber3);
    channel1.subscribe(subscriber4);

    // client is pushing notification to all observer.
    channel1.addVideo("Design Pattern unleashed in 10 min.");

    // client is notifying all the observers.

    // 1. Client need to call the Subject to get the list of Observers.
    // 2. Notifying the observers.
    channel1.getSubscribers().forEach(subscriber -> subscriber.notify(
        "New video added with title: Design Pattern unleashed in 10 min."));
  }
}
