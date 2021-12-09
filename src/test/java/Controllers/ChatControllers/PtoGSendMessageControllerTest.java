package Controllers.ChatControllers;

import Entity.Message.Group;
import Entity.Message.PtoGMessage;
import Entity.Users.User;

import UseCase.PtoGMessageManager;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class PtoGSendMessageControllerTest {

    // Test group chat history file
    @Test
    void sendGroupMessage() throws IOException {
        User u = new User("edg","123");
        Group g = new Group("ig");
        PtoGMessage msg = new PtoGMessage(u, g,"nb");
        PtoGMessageManager ptoGMessageManager = new PtoGMessageManager();
        ptoGMessageManager.sendGroupMessage(u, g, msg);
    }
}