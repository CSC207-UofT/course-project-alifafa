package main.Controllers.ChatControllers;

import main.Message;
import main.PtoPMessageManager;
import main.User;

import java.util.ArrayList;

public class PtoPChatController extends ChatController{
    /**
     * This class is responsible for controlling messages between two users
     */

    private final PtoPMessageManager ptopMessageManager = new PtoPMessageManager();
    private final UserManager userManager = new UserManger();

    public void runChat(String senderUserID, String receiverUserID, String content){

        User sender = userManager.getUser(senderUserID);
        User receiver = userManager.getUser(receiverUserID);
        Message message = ptopMessageManager.createMessage(sender, receiver, content);

        //print old message history between sender and receiver.
        ArrayList<Message> oldMessageHistory = ptopMessageManager.receiveMessageHistory(sender, receiver);
        for (Message m: oldMessageHistory){
            System.out.println(m);
        }

        //send the message from the sender to the receiver
        ptopMessageManager.sendMessage(sender, receiver, message);

        //print updated message history between sender and receiver.
        ArrayList<Message> updatedMessageHistory = ptopMessageManager.receiveMessageHistory(sender, receiver);
        for (Message m: updatedMessageHistory){
            System.out.println(m);
        }
    }
}
