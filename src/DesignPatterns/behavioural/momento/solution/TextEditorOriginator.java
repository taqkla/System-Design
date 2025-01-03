package DesignPatterns.behavioural.momento.solution;

public class TextEditorOriginator {

  private String text;

  public void setText(String text) {
    this.text = text;
    System.out.println("Current Text: " + text);
  }

  public Momento save() {
    return new Momento(text);
  }

  public void restore(Momento memento) {
    text = memento.getState();
    System.out.println("Restored Text: " + text);
  }

}
