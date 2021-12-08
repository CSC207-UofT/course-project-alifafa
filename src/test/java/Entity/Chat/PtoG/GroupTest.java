package Entity.Chat.PtoG;

import Entity.GroupChat.Group;
import Entity.GroupChat.PtoGMessage;
import Entity.Users.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.util.ArrayList;


//This is a test for PtoGMessage.
public class GroupTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    @Test
    public void getGroupName() {
        Group rng = new Group("rng");
        Assert.assertEquals("rng", rng.getGroupName());
    }

    @Test
    public void getGroupMembers() {
        User edg = new User("edg", "123");
        Group rng = new Group( "rng");
        rng.addMember(edg);
        ArrayList<User> lst = new ArrayList<>();
        lst.add(edg);
        Assert.assertEquals(lst, rng.getMembers());
    }

    @Test
    public void addGroupMember() {
        User edg = new User("edg", "123");
        Group rng = new Group( "rng");
        User dk = new User("dk", "456");
        rng.addMember(edg);
        rng.addMember(dk);
        ArrayList<User> lst = new ArrayList<>();
        lst.add(edg);
        lst.add(dk);
        Assert.assertEquals(lst, rng.getMembers());
    }

    @Test
    public void getGroupMessage() {
        User edg = new User("edg", "123");
        Group rng = new Group("rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        ArrayList<PtoGMessage> msg = new ArrayList<>();
        msg.add(message);
        rng.addGroupMessage(message);
        Assert.assertEquals(msg, rng.getMessage());
    }

    @Test
    public void testGetGroupName() {
        Group rng = new Group( "rng");
        Assert.assertEquals("rng", rng.getGroupName());
    }


    @Test
    public void kickMember() {
        Group rng = new Group( "rng");
        User edg = new User("edg", "123");
        rng.addMember(edg);
        rng.kickGroupMember(edg);
        ArrayList<User> lst = new ArrayList<>();
        Assert.assertEquals(lst, rng.getMembers());
    }

}