package DesignPatterns.behavioural.command.solution;

import java.util.Stack;

// Invoker
public class RemoteControl {

  Command command;

  // [TurnOnAc]
  Stack<Command> commandHistory = new Stack<>();

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
    commandHistory.push(command);
  }

  public void undo() {
    if (!commandHistory.isEmpty()) {
      Command lastCommand = commandHistory.pop();
      lastCommand.undo();
    }
  }
}
