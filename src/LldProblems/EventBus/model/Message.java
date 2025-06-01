package LldProblems.EventBus.model;


import java.util.Map;

public class Message {

  private final String msg;

  private final String messageId;

  private final Map<String, Object> payload;
  // {
  //   "id" :1234
  //   "Name": "Keshav"
  // }


  public Message(String msg, String messageId, Map<String, Object> payload) {
    this.msg = msg;
    this.messageId = messageId;
    this.payload = payload;
  }

  public String getMsg() {
    return msg;
  }
}
