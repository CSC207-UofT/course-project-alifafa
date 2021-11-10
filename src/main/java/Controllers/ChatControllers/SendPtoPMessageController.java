package Controllers.ChatControllers;

import Entity.PtoPMessage;
import UseCase.PtoPMessageManager;
import Entity.User;
import UseCase.UserManager;
import inputBoundaries.PtoPMessageInputBoundary;
import outputBoundaries.PtoPMessageOutputBoundary;

public class SendPtoPMessageController extends ChatController {
    /**
     * This class is responsible for controlling messages between two users
     */

    private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();

    public SendPtoPMessageController(){
        super();
        this.userPrompt.add("My UserID");
        this.userPrompt.add("Friend's UserID");
        this.userPrompt.add("Message");
    }


    /**
     * Sends message from one user to another user
     * @param senderUserID sender's userID
     * @param receiverUserID receiver's userID
     * @param content the content of a message
     */
    public void sendMessage(String senderUserID, String receiverUserID, String content){

        User sender = userManager.getUser(senderUserID);
        User receiver = userManager.getUser(receiverUserID);

        ptoPMessageInputBoundary.sendMessage(sender, receiver, ptoPMessageInputBoundary.createMessage(sender, receiver, content));
    }

    public void receiveMessageHistory(String senderUserID, String receiverUserID,
                                      PtoPMessageOutputBoundary outputBoundary){
        ptoPMessageInputBoundary.receiveMessageHistory(sender, receiver, outputBoundary);
    }


}
