package Controllers.ChatControllers;


import Presenters.PtoPMessageHistoryPresenter;

import java.io.IOException;

public class PtoPMessageControllerFacade {
    /**
     * This class's is a Facade for ptop message, which contains methods in PtoPSendMessageController and
     * PtoPReceiveMessageController.
     */

    private final PtoPSendMessageController ptoPSendMessageController = new PtoPSendMessageController();
    private final PtoPReceiveMessageController ptoPReceiveMessageController = new PtoPReceiveMessageController();

    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUsername sender's name
     * @param receiverUsername receiver's name
     * @param presenter PtoPMessageHistoryPresenter
     */
    public void receiveMessageHistory(String senderUsername, String receiverUsername,
                                      PtoPMessageHistoryPresenter presenter){
        ptoPReceiveMessageController.receiveMessageHistory(senderUsername, receiverUsername, presenter);
    }

    public void sendMessage(String senderUsername, String receiverUsername, String content) throws IOException {
        ptoPSendMessageController.sendMessage(senderUsername, receiverUsername, content);
    }


}