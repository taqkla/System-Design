package DesignPatterns.behavioural.command.solution;

public class TurnOnAc implements Command {

  AirConditioner ac;

  public TurnOnAc(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOnAC();
  }

  @Override
  public void undo() {
    ac.turnOffAC();
  }

}
