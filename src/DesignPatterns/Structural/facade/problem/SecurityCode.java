package DesignPatterns.Structural.facade.problem;

public class SecurityCode {

  int code;

  public SecurityCode(int code) {
    this.code = code;
  }

  public boolean checkCode() {
    //DB entry
    return this.code == 435;

  }
}
