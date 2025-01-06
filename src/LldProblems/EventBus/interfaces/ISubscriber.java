package LldProblems.EventBus.interfaces;

import LldProblems.EventBus.model.Message;

public interface ISubscriber {

  String getId();

  void consume(Message message) throws InterruptedException;
}
