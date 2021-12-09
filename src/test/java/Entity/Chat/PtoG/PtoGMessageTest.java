package Entity.Chat.PtoG;

import Entity.Message.Group;
import Entity.Message.PtoGMessage;
import Entity.Users.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;


//This is a test for PtoGMessage.
public class PtoGMessageTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Test
    public void getGroupContent() {
        User edg = new User("edg", "123");
        Group rng = new Group( "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals("hi", message.getContent());
    }

    @Test
    public void getGroupSender() {
        User edg = new User("edg", "123");
        Group rng = new Group( "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals(edg, message.getSender());
    }

    @Test
    public void getGroupReceiver() {
        User edg = new User("edg", "123");
        Group rng = new Group("rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals(rng, message.getGroup());
    }

}