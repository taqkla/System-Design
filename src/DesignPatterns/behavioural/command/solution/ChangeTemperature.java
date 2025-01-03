package DesignPatterns.behavioural.command.solution;

public class ChangeTemperature implements Command {

  AirConditioner ac;

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
