package Controllers.ChatControllers;

import Presenters.PtoGMessageHistoryPresenter;

import java.io.IOException;

public class PtoGMessageControllerFacade {
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
    public void GroupMessageHistory(String senderUsername, String receiverUsername,
                                      PtoGMessageHistoryPresenter presenter){
        ptoGReceiveMessageController.receiveMessageHistory(senderUsername, receiverUsername, presenter);
    }

    public void sendGroupMessage(String senderUsername, String receiverUsername, String content) throws IOException {
        ptoGSendMessageController.sendGroupMessage(senderUsername, receiverUsername, content);
    }


}