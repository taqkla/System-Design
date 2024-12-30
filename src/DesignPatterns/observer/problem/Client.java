package DesignPatterns.observer.problem;

public class Client {

  public static void main(String[] args) {
    YoutubeChannel channel1 = new YoutubeChannel("SportsTak.");
    YoutubeChannel channel2 = new YoutubeChannel("Daily Code");
    Subscriber subscriber1 = new Subscriber("Mohit");
    Subscriber subscriber2 = new Subscriber("Raina");
    Subscriber subscriber3 = new Subscriber("Dhoni");
    Subscriber subscriber4 = new Subscriber("Deepak");
    channel1.subscribe(subscriber1);
    channel1.subscribe(subscriber3);
    channel1.subscribe(subscriber4);
    channel2.subscribe(subscriber2);
    channel2.subscribe(subscriber4);
    channel1.addVideo("Design Pattern unleashed in 10 min.");
    channel1.getSubscribers().forEach(subscriber -> subscriber.notify(
        "New video added with title: Design Pattern unleashed in 10 min."));
    channel2.addVideo("India won the world cup by 23 runs.");
    channel2.getSubscribers().forEach(subscriber -> subscriber.notify(
        "New video added with title : India won the world cup by 23 runs."));
  }
}
