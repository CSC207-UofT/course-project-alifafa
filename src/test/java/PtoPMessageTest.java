import Entity.PtoPMessage;
import Entity.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//This is a test for PtoPMessage.
public class PtoPMessageTest {

    @Test
    public void getContent() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        assertEquals("hi", message.getContent());
    }

    @Test
    public void getSender() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        assertEquals(a, message.getSender());
    }

    @Test
    public void getReceiver() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        assertEquals(b, message.getReceiver());
    }

}