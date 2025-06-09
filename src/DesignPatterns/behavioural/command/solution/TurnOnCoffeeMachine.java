package DesignPatterns.behavioural.command.solution;

public class TurnOnCoffeeMachine implements Command {

  private CoffeeMachine coffeeMachine;

  public TurnOnCoffeeMachine(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void execute() {

    this.coffeeMachine.turnOnCoffeeMachine();
  }

  @Override
  public void undo() {

    this.coffeeMachine.turnOffCoffeeMachine();
  }
}
