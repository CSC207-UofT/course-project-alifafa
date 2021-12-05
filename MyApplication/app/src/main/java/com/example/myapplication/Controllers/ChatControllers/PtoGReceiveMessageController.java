package com.example.myapplication.Controllers.ChatControllers;

import com.example.myapplication.InputBoundary.GroupInputBoundary;
import com.example.myapplication.InputBoundary.PtoGMessageInputBoundary;
import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.PtoGMessageHistoryPresenter;
import com.example.myapplication.UseCase.GroupManager;
import com.example.myapplication.UseCase.PtoGMessageManager;
import com.example.myapplication.UseCase.UserManager;

public class PtoGReceiveMessageController {
    /**
     * This class is responsible for receiving messages for a group
     */

    //The input boundary of this class, which is implemented by PtoGMessageManager. It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoGMessageInputBoundary PtoGMessageInputBoundary= new PtoGMessageManager();
    private final UserInputBoundary userInputBoundary = new UserManager();
    private final GroupInputBoundary groupInputBoundary = new GroupManager();

    /**
     * Stores all messages in a given group.
     *
     * @param senderUserID sender's id
     * @param GroupID group's id
     * @param presenter PtoGMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUserID, String GroupID,
                                      PtoGMessageHistoryPresenter presenter){
        PtoGMessageInputBoundary.GroupMessageHistory(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupID), presenter);
    }

}