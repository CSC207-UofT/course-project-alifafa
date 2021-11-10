package Controllers.ChatControllers;

import Entity.PtoPMessage;
import UseCase.PtoPMessageManager;
import Entity.User;
import UseCase.UserManager;

public class PtoPChatController extends ChatController {
    /**
     * This class is responsible for controlling messages between two users
     */

    private final PtoPMessageManager ptopMessageManager = new PtoPMessageManager();
    private final UserManager userManager = new UserManager();

    public PtoPChatController(){
        super();
        this.userPrompt.add("My UserID");
        this.userPrompt.add("Friend's UserID");
        this.userPrompt.add("Message");
    }

    /**
     * Shows previous chat history, sends message from one user to another user, then shows updated chat history
     * @param senderUserID sender's userID
     * @param receiverUserID receiver's userID
     * @param content the content of a message
     */
    public void runChat(String senderUserID, String receiverUserID, String content){

        User sender = userManager.getUser(senderUserID);
        User receiver = userManager.getUser(receiverUserID);
        PtoPMessage message = ptopMessageManager.createMessage(sender, receiver, content);

        //print old message history between sender and receiver.
        System.out.println("Previous chat history:");
        ptopMessageManager.receiveMessageHistory(sender, receiver);

        //send the message from the sender to the receiver
        ptopMessageManager.sendMessage(sender, receiver, message);

        //print updated message history between sender and receiver.
        System.out.println("Updated chat history:");
        ptopMessageManager.receiveMessageHistory(sender, receiver);
    }
}
