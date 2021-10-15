package main.Controllers.ChatControllers;

import main.PtoPMessage;
import main.PtoPMessage;
import main.PtoPMessageManager;
import main.User;
import main.UserManager;

import java.util.ArrayList;

public class PtoPChatController extends ChatController{
    /**
     * This class is responsible for controlling messages between two users
     */

    private final PtoPMessageManager ptopMessageManager = new PtoPMessageManager();
    private final UserManager userManager = new UserManager();

    public void runChat(String senderUserID, String receiverUserID, String content){

        User sender = userManager.getUser(senderUserID);
        User receiver = userManager.getUser(receiverUserID);
        PtoPMessage message = ptopMessageManager.createMessage(sender, receiver, content);

        //print old message history between sender and receiver.
       ptopMessageManager.receiveMessageHistory(sender, receiver);

        //send the message from the sender to the receiver
        ptopMessageManager.sendMessage(sender, receiver, message);

        //print updated message history between sender and receiver.
        ptopMessageManager.receiveMessageHistory(sender, receiver);
    }
}
