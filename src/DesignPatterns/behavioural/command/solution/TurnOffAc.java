package DesignPatterns.behavioural.command.solution;

public class TurnOffAc implements Command {

  AirConditioner ac;

  public TurnOffAc(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOffAC();
  }

  @Override
  public void undo() {
    ac.turnOnAC();
  }
}