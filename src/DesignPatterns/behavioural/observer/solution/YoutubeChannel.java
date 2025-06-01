package DesignPatterns.behavioural.observer.solution;

import java.util.ArrayList;


/**
 * Subject
 */
public class YoutubeChannel {

  private final String name;
  private ArrayList<Subscriber> subscribers; // list of observers
  private ArrayList<String> videos;

  YoutubeChannel(String name) {
    this.name = name;
    this.subscribers = new ArrayList<>(); // list of observer objects.
    this.videos = new ArrayList<>();
  }

  // register
  public void subscribe(Subscriber subscriber) {
    this.subscribers.add(subscriber);
  }

  // unregister
  public void unSubscribe(Subscriber subscriber) {
    this.subscribers.remove(subscriber);
  }

  public void addVideo(String name) {
    this.videos.add(name); // state change in the current object.
    sendNotificationToAllObserver(name);
    // the notification to all the observers for the state change.
  }

  private void sendNotificationToAllObserver(String name) {
    this.subscribers.forEach(subscriber -> subscriber.notified(
        String.format("New video added with title: %s", name)));
  }

  public ArrayList<Subscriber> getSubscribers() {
    return this.subscribers;
  }
}
