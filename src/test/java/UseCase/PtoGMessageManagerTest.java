package UseCase;

import Entity.GroupChat.Group;
import Entity.GroupChat.PtoGMessage;
import Entity.Users.User;
import Presenters.Message.PtoGMessageHistoryPresenter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PtoGMessageManagerTest {

    User u = new User("edg","123");
    Group g = new Group("ig");
    String text = "nb";
    PtoGMessageManager ptoGMessageManager = new PtoGMessageManager();
    PtoGMessageHistoryPresenter ptoGMessageHistoryPresenter = new PtoGMessageHistoryPresenter();


    @Test
    void createMessage() {
        PtoGMessage message = ptoGMessageManager.createMessage(u, g, text);
        assertEquals("nb", message.getContent());
    }


    @Test
    void sendMessage() throws IOException {
        PtoGMessage message = new PtoGMessage(u, g, text);
        ptoGMessageManager.sendGroupMessage(u, g, message);
    }

    @Test
    void receiveMessageHistory() {
        ptoGMessageManager.GroupMessageHistory(u, g, ptoGMessageHistoryPresenter);
    }
}