package Entity;

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
    public void getContent() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals("hi", message.getContent());
    }

    @Test
    public void getSender() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals(edg, message.getSender());
    }

    @Test
    public void getReceiver() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        Assert.assertEquals(rng, message.getGroup());
    }

}