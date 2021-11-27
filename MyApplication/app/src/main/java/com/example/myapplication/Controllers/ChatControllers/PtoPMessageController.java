package com.example.myapplication.Controllers.ChatControllers;

import com.example.myapplication.InputBoundary.*;
import com.example.myapplication.Presenters.PtoGMessageHistoryPresenter;
import com.example.myapplication.UseCase.*;

public class PtoPMessageController {
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
    public void sendMessage(String senderUserID, String GroupID, String content) {

        ptoGMessageInputBoundary.sendMessage(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID) ,
                ptoGMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserID),
                        groupInputBoundary.getGroup(GroupID) , content));
    }


    /**
     * Stores all messages in a given group.
     *
     * @param senderUserID sender's id
     * @param GroupID group's id
     * @param presenter PtoGMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUserID, String GroupID,
                                      PtoGMessageHistoryPresenter presenter){
        ptoGMessageInputBoundary.receiveMessageHistory(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID), presenter);
    }
}
