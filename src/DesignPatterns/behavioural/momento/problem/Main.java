package DesignPatterns.behavioural.momento.problem;

class Settings {

  private String colorCode;
  private String background;

  @Override
  public String toString() {
    return "Settings{" +
        "colorCode='" + colorCode + '\'' +
        ", background='" + background + '\'' +
        '}';
  }

  public void setColorCode(String colorCode) {
    this.colorCode = colorCode;
  }

  public void setBackground(String background) {
    this.background = background;
  }
}
public class Main {

  public static void main(String[] args) {
    Settings settings = new Settings();
    settings.setBackground("Bg");
    settings.setColorCode("ffffff");
    System.out.println(settings.toString());
    settings.setBackground("Backgroud");
    settings.setColorCode("f5f7ff");
    System.out.println(settings.toString());
  }

}
