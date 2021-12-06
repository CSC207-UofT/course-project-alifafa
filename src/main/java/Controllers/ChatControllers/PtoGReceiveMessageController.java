package Controllers.ChatControllers;

import InputBoundary.GroupInputBoundary;
import InputBoundary.PtoGMessageInputBoundary;
import InputBoundary.UserInputBoundary;
import Presenters.PtoGMessageHistoryPresenter;
import UseCase.GroupManager;
import UseCase.PtoGMessageManager;
import UseCase.UserManager;

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
     * @param GroupName group's Name
     * @param presenter PtoGMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUserID, String GroupName,
                                      PtoGMessageHistoryPresenter presenter){
        PtoGMessageInputBoundary.GroupMessageHistory(userInputBoundary.getUser(senderUserID),
                groupInputBoundary.getGroup(GroupName), presenter);
    }

}