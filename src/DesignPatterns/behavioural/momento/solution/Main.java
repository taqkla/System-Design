package DesignPatterns.behavioural.momento.solution;

/**
 * The Memento Method Design Pattern is a behavioral design pattern that allows an object to capture
 * and store its internal state without exposing its implementation details. This pattern enables
 * the restoration of an object to a previous state, facilitating the implementation of features
 * such as undo/redo functionality. The Memento pattern decouples the object’s state from its
 * behavior, allowing the object to maintain its state history while preventing direct access to its
 * internal state.
 *
 * 1. Originator : Represents an object, for which state need to be saved and restored.
 * 2. Momento : holds the state of the momento.
 * 3. Caretaker: managers the states.
 */
public class Main {

  public static void main(String[] args) {
    TextEditorOriginator editor = new TextEditorOriginator();
    Caretaker caretaker = new Caretaker();

    // Type some text and save the state
    editor.setText("Hello, World!");
    caretaker.addMemento(editor.save());

    editor.setText("Hello, Design Patterns!");
    caretaker.addMemento(editor.save());

    editor.setText("Hello, Memento Pattern!");

    // Restore to the previous state
    editor.restore(caretaker.getMomento(1)); // Restores "Hello, Design Patterns!"
    editor.restore(caretaker.getMomento(0)); // Restores "Hello, World!"

  }
}





