package Controllers.ChatControllers.PtoG;

import Presenters.Message.PtoGMessageHistoryPresenter;

import java.io.IOException;

public class PtoGMessageControllerFacade {
    /**
     * This class's is a Facade for PtoG message, which contains methods in PtoGSendMessageController and
     * PtoGReceiveMessageController.
     */

    private final PtoGSendMessageController ptoGSendMessageController = new PtoGSendMessageController();
    private final PtoGReceiveMessageController ptoGReceiveMessageController = new PtoGReceiveMessageController();

    /**
     * Stores all messages between receiver and sender.
     *
     * @param senderUsername sender's username
     * @param GroupName      group's name
     * @param presenter      PtoGMessageHistoryPresenter
     */
    public void GroupMessageHistory(String senderUsername, String GroupName,
                                    PtoGMessageHistoryPresenter presenter) {
        ptoGReceiveMessageController.receiveMessageHistory(senderUsername, GroupName, presenter);
    }

    public void sendGroupMessage(String senderUsername, String GroupName, String content) throws IOException {
        ptoGSendMessageController.sendGroupMessage(senderUsername, GroupName, content);
    }


}