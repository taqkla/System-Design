package LldProblems.EventBusWithRetry.model;

public class Offset {

  int val;

  public Offset(int val) {
    this.val = val;
  }

  public Offset increment() {
    return new Offset(val + 1);
  }

  public int getVal() {
    return val;
  }
}
