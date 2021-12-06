package Controllers.ChatControllers;


import InputBoundary.GroupInputBoundary;
import InputBoundary.PtoGMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import Presenters.PtoGMessageHistoryPresenter;
import UseCase.GroupManager;
import UseCase.PtoGMessageManager;
import UseCase.UserManager;

import java.io.IOException;

public class PtoGMessageController {

    /**
     * This class is responsible for controlling messages between two users
     */

    //The input boundary of this class, which is implemented by PtoGMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoGMessageInputBoundary ptoGMessageInputBoundary = new PtoGMessageManager();
    private final GroupInputBoundary groupInputBoundary = new GroupManager();
    private final UserInputBoundary userInputBoundary = new UserManager();



    /**
     * Sends message from one user to a group.
     * @param senderUserID sender's userID
     * @param GroupID group's ID
     * @param content the content of a message
     */
    public void sendGroupMessage(String senderUserID, String GroupID, String content) throws IOException {

        ptoGMessageInputBoundary.sendGroupMessage(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID) ,
                ptoGMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserID),
                        groupInputBoundary.getGroup(GroupID) , content));
    }


    /**
     * Stores all messages in a given group.
     *
     * @param senderUserName sender's name
     * @param GroupID group's id
     * @param presenter PtoGMessageHistoryPresenter
     */
    public void GroupMessageHistory(String senderUserName, String GroupID,
                                    PtoGMessageHistoryPresenter presenter){
        ptoGMessageInputBoundary.GroupMessageHistory(userInputBoundary.getUser(senderUserName),
                groupInputBoundary.getGroup(GroupID), presenter);
    }

}