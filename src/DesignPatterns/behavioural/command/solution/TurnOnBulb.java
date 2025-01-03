package DesignPatterns.behavioural.command.solution;

public class TurnOnBulb implements Command {

  Bulb bulb;


  public TurnOnBulb(Bulb bulb) {
    this.bulb = bulb;
  }

  @Override
  public void execute() {
    bulb.turnOnBulb();
  }

  @Override
  public void undo() {
    bulb.turnOffBulb();
  }
}
