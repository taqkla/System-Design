package DesignPatterns.behavioural.command.solution;

public class TurnOffBulb implements Command {

  Bulb bulb;


  public TurnOffBulb(Bulb bulb) {
    this.bulb = bulb;
  }

  @Override
  public void execute() {
    bulb.turnOffBulb();
  }

  @Override
  public void undo() {
    bulb.turnOnBulb();
  }
}
