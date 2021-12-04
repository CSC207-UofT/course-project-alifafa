package com.example.myapplication.Controllers.ChatControllers;

import com.example.myapplication.InputBoundary.PtoPMessageInputBoundary;
import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.PtoPMessageHistoryPresenter;
import com.example.myapplication.UseCase.PtoPMessageManager;
import com.example.myapplication.UseCase.UserManager;

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
