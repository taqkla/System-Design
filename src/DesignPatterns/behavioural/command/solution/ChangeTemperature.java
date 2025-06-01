package DesignPatterns.behavioural.command.solution;

public class ChangeTemperature implements Command {

  AirConditioner ac; // has-a with actual implementation

  public ChangeTemperature(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.setTemperature(18);
  }

  @Override
  public void undo() {
    ac.setTemperature(0);
  }
}
