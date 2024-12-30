package DesignPatterns.observer.problem;

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
    this.subscribers = new ArrayList<>();
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
    this.videos.add(name);
  }

  public ArrayList<Subscriber> getSubscribers() {
    return this.subscribers;
  }
}
