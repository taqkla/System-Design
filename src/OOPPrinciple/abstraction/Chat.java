package OOPPrinciple.abstraction;


import java.util.ArrayList;

public class Chat {

  // private String chatId;

  Chat() {
    // this.chatId = uuid();
  }

  // private ArrayList<Integer> retrieveMembers() {
  //   return UserServiceHandler.retieveMembers(this.chatId);
  // }

  private ArrayList<Integer> optOutReceivers()  {
    return null;
  }

  void sendMessage(int senderId, String text) {
    // retrieve members of a chat
    // check if anyone blocked the sender, opt them out
    // send the message to all the receivers except the sender.
    // send the notification to all receivers
  };


  void deleteChat() {

  };
}
