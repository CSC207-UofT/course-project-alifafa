package com.example.myapplication.Controllers.ChatControllers;

import com.example.myapplication.InputBoundary.GroupInputBoundary;
import com.example.myapplication.InputBoundary.PtoGMessageInputBoundary;
import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.UseCase.GroupManager;
import com.example.myapplication.UseCase.PtoGMessageManager;
import com.example.myapplication.UseCase.UserManager;

import java.io.IOException;

public class PtoGSendMessageController {

    /**
     * This class is responsible for sending messages from a user to a group
     */

    private final PtoGMessageInputBoundary ptoGMessageInputBoundary = new PtoGMessageManager();
    private final GroupInputBoundary groupInputBoundary = new GroupManager();
    private final UserInputBoundary userInputBoundary = new UserManager();


    /**
     * Sends message from one user to a group.
     *
     * @param senderUserID sender's userID
     * @param GroupName      group's Name
     * @param content      the content of a message
     */
    public void sendGroupMessage(String senderUserID, String GroupName, String content) throws IOException{

        ptoGMessageInputBoundary.sendGroupMessage(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupName),
                ptoGMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserID),
                        groupInputBoundary.getGroup(GroupName), content));
    }

}