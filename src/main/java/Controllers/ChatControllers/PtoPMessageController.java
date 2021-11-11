package Controllers.ChatControllers;

import Entity.User;
import InputBoundary.PtoPMessageInputBoundary;
import OutputBoundary.PtoPMessageOutputBoundary;

import java.io.IOException;

public class PtoPMessageController extends ChatController {
    /**
     * This class is responsible for controlling messages between two users
     */

    //The input boundary of this class, which is implemented by PtoPMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    //  private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final PtoPMessageInputBoundary ptoPMessageInputBoundary;

    public PtoPMessageController(PtoPMessageInputBoundary ptoPMessageInputBoundary){
        this.ptoPMessageInputBoundary = ptoPMessageInputBoundary;
    }


    /**
     * Sends message from one user to another user
     * @param senderUserID sender's userID
     * @param receiverUserID receiver's userID
     * @param content the content of a message
     */
    public void sendMessage(String senderUserID, String receiverUserID, String content) throws IOException {

        User sender = userManager.getUser(senderUserID);
        User receiver = userManager.getUser(receiverUserID);

        ptoPMessageInputBoundary.sendMessage(sender, receiver, ptoPMessageInputBoundary.createMessage(sender, receiver, content));
    }

    public void receiveMessageHistory(String senderUserID, String receiverUserID,
                                      PtoPMessageOutputBoundary outputBoundary){
        ptoPMessageInputBoundary.receiveMessageHistory(sender, receiver, outputBoundary);
    }


}
