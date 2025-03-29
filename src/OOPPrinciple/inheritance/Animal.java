package OOPPrinciple.inheritance;

class Animal {

  public String name;
  private int energy = 100;
  private int hunger;

  Animal(String name) {
    this.name = name;
    System.out.println("This is a parent class parameterized constructor");
  }

  Animal() {
    System.out.println("This is a parent class empty constructor");
    this.name = "Prateek";
  }

  public int getEnergy() {
    return energy;
  }

  public int getHunger() {
    return hunger;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public String getName() {
    return name;
  }

  protected void play() {
    energy -= 10;
    hunger += 10;
  }

  protected void sleep() {
    energy = 100;
    hunger += 1;
  }

  protected void eat() {
    energy -= 1;
    hunger = 0;
  }
}

