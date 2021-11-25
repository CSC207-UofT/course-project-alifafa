package Controllers.ChatControllers;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Gateway.PtoPMessageDataAccess;
import InputBoundary.PtoPMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import Presenters.PtoPMessageHistoryPresenter;
import UseCase.PtoPMessageManager;
import UseCase.UserManager;

import java.io.IOException;

public class PtoPMessageController{
    /**
     * This class is responsible for controlling messages between two users
     */

    //The input boundary of this class, which is implemented by PtoPMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    //  private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface = new PtoPMessageDataAccess();
    private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager(ptoPMessageDataAccessInterface);
    private final UserInputBoundary userInputBoundary = new UserManager();

//    TODO: public PtoPMessageController(PtoPMessageInputBoundary ptoPMessageInputBoundary, UserInputBoundary userInputBoundary){
//        this.ptoPMessageInputBoundary = ptoPMessageInputBoundary;
//        this.userInputBoundary = userInputBoundary;
//    }


    /**
     * Sends message from one user to another user
     * @param senderUserID sender's userID
     * @param receiverUserID receiver's userID
     * @param content the content of a message
     */
    public void sendMessage(String senderUserID, String receiverUserID, String content) throws IOException {
        ptoPMessageInputBoundary.sendMessage(userInputBoundary.getUser(senderUserID),
                userInputBoundary.getUser(receiverUserID) ,
                ptoPMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserID),
                        userInputBoundary.getUser(receiverUserID) , content));
    }


    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUserID sender's id
     * @param receiverUserID receiver's id
     * @param presenter PtoPMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUserID, String receiverUserID,
                                      PtoPMessageHistoryPresenter presenter){
        ptoPMessageInputBoundary.receiveMessageHistory(userInputBoundary.getUser(senderUserID),
                userInputBoundary.getUser(receiverUserID), presenter);
    }


}
