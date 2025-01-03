package DesignPatterns.behavioural.momento.solution;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

  private List<Momento> momentoList = new ArrayList<>();

  public void addMemento(Momento momento) {
    momentoList.add(momento);
  }

  public Momento getMomento(int index) {
    return momentoList.get(index);
  }

}
