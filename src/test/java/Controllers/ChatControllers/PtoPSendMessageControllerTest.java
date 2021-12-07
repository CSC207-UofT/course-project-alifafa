package Controllers.ChatControllers;

import Entity.Message.PtoPMessage;
import Entity.Users.User;

import UseCase.PtoPMessageManager;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class PtoPSendMessageControllerTest {

    // Test whether the test history files will be generated successfully.
    @Test
    void sendMessage() throws IOException {
        User userC = new User("TesterC","123");
        User userD = new User("TesterD","123");
        PtoPMessage message = new PtoPMessage(userC,userD,"hi");
        PtoPMessageManager ptoPMessageManager = new PtoPMessageManager();
        ptoPMessageManager.sendMessage(userC, userD, message);
    }
}