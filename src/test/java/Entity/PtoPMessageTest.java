package Entity;

import Entity.Message.PtoPMessage;
import Entity.Users.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;


//This is a test for PtoPMessage.
public class PtoPMessageTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Test
    public void getContent() {
        User a = new User("1", "a");
        User b = new User("2", "b");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        Assert.assertEquals("hi", message.getContent());
    }

    @Test
    public void getSender() {
        User a = new User("1", "a");
        User b = new User("2", "b");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        Assert.assertEquals(a, message.getSender());
    }

    @Test
    public void getReceiver() {
        User a = new User("1", "a");
        User b = new User("2", "b");
        PtoPMessage message = new PtoPMessage(a, b, "hi");
        Assert.assertEquals(b, message.getReceiver());
    }

}