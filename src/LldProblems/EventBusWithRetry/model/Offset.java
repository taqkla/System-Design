package LldProblems.EventBusWithRetry.model;

public class Index {

  int val;

  public Index(int val) {
    this.val = val;
  }

  public Index increment() {
    return new Index(val + 1);
  }

  public int getVal() {
    return val;
  }
}
