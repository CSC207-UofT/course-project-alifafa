package Controllers.ChatControllers;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.User;
import Gateway.PtoPMessageDataAccess;
import InputBoundary.GroupInputBoundary;
import InputBoundary.PtoGMessageInputBoundary;
import InputBoundary.PtoPMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import OutputBoundary.PtoPMessageOutputBoundary;
import Presenters.PtoGMessageHistoryPresenter;
import Presenters.PtoPMessageHistoryPresenter;
import UseCase.GroupManager;
import UseCase.PtoGMessageManager;
import UseCase.PtoPMessageManager;
import UseCase.UserManager;

import java.io.IOException;

public class PtoGMessageController{
    /**
     * This class is responsible for controlling messages between two users
     */

    //The input boundary of this class, which is implemented by PtoPMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    //  private final PtoPMessageInputBoundary ptoPMessageInputBoundary = new PtoPMessageManager();
    private final PtoGMessageInputBoundary ptoGMessageInputBoundary = new PtoGMessageManager();
    private final GroupInputBoundary groupInputBoundary = new GroupManager();
    private final UserInputBoundary userInputBoundary = new UserManager();



    /**
     * Sends message from one user to another user
     * @param senderUserID sender's userID
     * @param GroupID group's ID
     * @param content the content of a message
     */
    public void sendMessage(String senderUserID, String GroupID, String content) {

        ptoGMessageInputBoundary.sendMessage(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID) ,
                ptoGMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserID),
                        groupInputBoundary.getGroup(GroupID) , content));
    }


    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUserID sender's id
     * @param GroupID group's id
     * @param presenter PtoPMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUserID, String GroupID,
                                      PtoGMessageHistoryPresenter presenter){
        ptoGMessageInputBoundary.receiveMessageHistory(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID), presenter);
    }


}