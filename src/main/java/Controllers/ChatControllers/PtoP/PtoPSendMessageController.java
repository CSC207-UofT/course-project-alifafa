package Controllers.ChatControllers.PtoP;

import InputBoundary.PtoPMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import UseCase.PtoPMessageManager;
import UseCase.UserManager;

import java.io.IOException;

public class PtoPSendMessageController {

    /**
     * This class is responsible for sending messages between two users
     */

    //The input boundary of this class, which is implemented by PtoPMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    //  private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final UserInputBoundary userInputBoundary = new UserManager();

    /**
     * Sends message from one user to another user
     *
     * @param senderUsername   sender's username
     * @param receiverUsername receiver's username
     * @param content          the content of a message
     */
    public void sendMessage(String senderUsername, String receiverUsername, String content) throws IOException {
        ptoPMessageInputBoundary.sendMessage(userInputBoundary.getUser(senderUsername),
                userInputBoundary.getUser(receiverUsername),
                ptoPMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUsername),
                        userInputBoundary.getUser(receiverUsername), content));
    }
}