package Controllers.ChatControllers;

import InputBoundary.PtoPMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import Presenters.PtoPMessageHistoryPresenter;
import UseCase.PtoPMessageManager;
import UseCase.UserManager;

public class PtoPReceiveMessageController {
    /**
     * This class is responsible for receiving messages between two users
     */

    //The input boundary of this class, which is implemented by PtoPMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    //  private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final PtoPMessageInputBoundary ptoPMessageInputBoundary= new PtoPMessageManager();
    private final UserInputBoundary userInputBoundary = new UserManager();

    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUsername sender's name
     * @param receiverUsername receiver's name
     * @param presenter PtoPMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUsername, String receiverUsername,
                                      PtoPMessageHistoryPresenter presenter){
        ptoPMessageInputBoundary.receiveMessageHistory(userInputBoundary.getUser(senderUsername),
                userInputBoundary.getUser(receiverUsername), presenter);
    }

}