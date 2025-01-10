package LldProblems.EventBusWithRetry.model;

public class Timestamp implements Comparable<Timestamp> {

  long val;

  public Timestamp(long val) {
    this.val = val;
  }

  @Override
  public int compareTo(Timestamp timestamp) {
    return Long.compare(val, timestamp.val);
  }
}
