package com.example.myapplication.Controllers.ChatControllers;

import com.example.myapplication.Presenters.PtoGMessageHistoryPresenter;

import java.io.IOException;

public class PtoGMessageFacade {
    /**
     * This class's is a Facade for ptop message, which contains methods in PtoPSendMessageController and
     * PtoPReceiveMessageController.
     */

    private final PtoGSendMessageController ptoGSendMessageController = new PtoGSendMessageController();
    private final PtoGReceiveMessageController ptoGReceiveMessageController = new PtoGReceiveMessageController();

    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUsername sender's name
     * @param receiverUsername receiver's name
     * @param presenter PtoPMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUsername, String receiverUsername,
                                      PtoGMessageHistoryPresenter presenter){
        ptoGReceiveMessageController.receiveMessageHistory(senderUsername, receiverUsername, presenter);
    }

    public void sendMessage(String senderUsername, String receiverUsername, String content) throws IOException {
        ptoGSendMessageController.sendGroupMessage(senderUsername, receiverUsername, content);
    }


}