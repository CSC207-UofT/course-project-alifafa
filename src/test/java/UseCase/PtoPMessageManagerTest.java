package UseCase;

import Entity.Message.PtoPMessage;
import Entity.Users.User;
import Presenters.PtoPMessageHistoryPresenter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PtoPMessageManagerTest {

    User userA = new User("TesterA","123");
    User userB = new User("TesterB","123");
    String text = "hi";
    PtoPMessageManager ptoPMessageManager = new PtoPMessageManager();
    PtoPMessageHistoryPresenter ptoPMessageHistoryPresenter = new PtoPMessageHistoryPresenter();


    @Test
    void createMessage() {
        PtoPMessage message = ptoPMessageManager.createMessage(userA, userB, text);
        assertEquals("TesterA", userA.getUserName());
        assertEquals("TesterB", userB.getUserName());
        assertEquals("hi", message.getContent());
    }

    // Test whether the test history files will be generated successfully.
    @Test
    void sendMessage() throws IOException {
        PtoPMessage message = new PtoPMessage(userA,userB,text);
        ptoPMessageManager.sendMessage(userA, userB, message);
    }

    @Test
    void receiveMessageHistory() {
        ptoPMessageManager.receiveMessageHistory(userA, userB, ptoPMessageHistoryPresenter);
    }
}