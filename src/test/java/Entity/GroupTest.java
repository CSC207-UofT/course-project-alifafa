package Entity;

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
        Group rng = new Group("1", "rng");
        Assert.assertEquals("rng", rng.getGroupName());
    }

    @Test
    public void getMembers() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        rng.addMember(edg);
        ArrayList<User> lst = new ArrayList<>();
        lst.add(edg);
        Assert.assertEquals(lst, rng.getMembers());
    }

    @Test
    public void addMember() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        User dk = new User("3", "dk", "456");
        rng.addMember(edg);
        rng.addMember(dk);
        ArrayList<User> lst = new ArrayList<>();
        lst.add(edg);
        lst.add(dk);
        Assert.assertEquals(lst, rng.getMembers());
    }

    @Test
    public void getGroupMessage() {
        User edg = new User("1", "edg", "123");
        Group rng = new Group("2", "rng");
        PtoGMessage message = new PtoGMessage(edg, rng, "hi");
        ArrayList<PtoGMessage> msg = new ArrayList<>();
        msg.add(message);
        rng.addGroupMessage(message);
        Assert.assertEquals(msg, rng.getMessage());
    }

    @Test
    public void getGroupID() {
        Group rng = new Group("1", "rng");
        Assert.assertEquals("1", rng.getGroupID());
    }


}