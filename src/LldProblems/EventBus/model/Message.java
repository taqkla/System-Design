package LldProblems.EventBus.model;


public class Message {

  private final String msg;

  public Message(String msg) {
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }
}
