package DesignPatterns.behavioural.momento.solution;


// originator
public class TextEditorOriginator {

  private String text;

  public void setText(String text) {
    this.text = text;
    System.out.println("Current Text: " + text);
  }

  // Save a moment/state
  public Momento save() {
    return new Momento(text);
  }

  // restore the moment/state
  public void restore(Momento memento) {
    text = memento.getState();
    System.out.println("Restored Text: " + text);
  }

}
