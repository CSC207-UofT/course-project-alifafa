package Controllers.ChatControllers.PtoG;


import InputBoundary.GroupInputBoundary;
import InputBoundary.PtoGMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import UseCase.GroupManager;
import UseCase.PtoGMessageManager;
import UseCase.UserManager;

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
     * @param senderUserName sender's username
     * @param GroupName      group's Name
     * @param content      the content of a message
     */
    public void sendGroupMessage(String senderUserName, String GroupName, String content) throws IOException{

        ptoGMessageInputBoundary.sendGroupMessage(userInputBoundary.getUser(senderUserName),
                groupInputBoundary.getGroup(GroupName),
                ptoGMessageInputBoundary.createMessage(userInputBoundary.getUser(senderUserName),
                        groupInputBoundary.getGroup(GroupName), content));
    }

}