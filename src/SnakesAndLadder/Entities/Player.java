package SnakesAndLadder.Entities;

public class Player {

  private String name;

  private int position;

  public Player(String name, int position) {
    this.name = name;
    this.position = position;
  }

  void move(int steps) {
    position += steps;
  }

}
