package DesignPatterns.behavioural.observer.solution;

public class Client {

  public static void main(String[] args) {
    YoutubeChannel channel1 = new YoutubeChannel("Sports Tak.");
    YoutubeChannel channel2 = new YoutubeChannel("DailyCode");
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
    channel2.addVideo("India won the world cup by 23 runs.");
    channel1.unSubscribe(subscriber1);
    channel1.addVideo("Learning LLD in 20 min.");
  }
}
