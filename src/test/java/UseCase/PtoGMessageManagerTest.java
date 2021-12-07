package UseCase;

import Entity.Group;
import Entity.PtoGMessage;
import Entity.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import java.util.ArrayList;


/**
 * PtoGMessageManager Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 9, 2021</pre>
 * @version 1.0
 */


public class PtoGMessageManagerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: sendGroupMessage(User sender, Group group, PtoGMessage message)
     *
     */
    @Test
    public void testSendGroupMessage() throws Exception {
        User user = new User("edg", "123");
        Group group = new Group("ig");
        PtoGMessageManager manager = new PtoGMessageManager();
        PtoGMessage message = new PtoGMessage(user, group, "hi");
        manager.sendGroupMessage(user, group, message);
        ArrayList<PtoGMessage> msg = new ArrayList<>();
        msg.add(message);
        Assert.assertEquals(msg, group.getMessage());
    }

    /**
     *
     * Method: GroupMessageHistory(outboudnaries..)
     *
     */
    @Test
    public void testGroupMessageHistory() throws Exception {
        User user = new User("edg", "123");
        Group group = new Group("ig");
        PtoGMessageManager manager = new PtoGMessageManager();
        PtoGMessage message = new PtoGMessage(user, group, "hi");
//        PtoGMessageOutputBoundary b = new PtoGMessageOutputBoundary();
        manager.sendGroupMessage(user, group, message);
//        manager.GroupMessageHistory(user, group, );
        ArrayList<PtoGMessage> msg = new ArrayList<>();
        msg.add(message);
        Assert.assertEquals(msg, group.getMessage());
    }

//    /**
//     *
//     * Method: deleteMessage(Group g, PtoGMessage message)
//     *
//     */
//    @Test
//    public void testDeleteMessage()


    /**
     *
     * Method: createGroupMessage(User sender, Group g, String text)
     *
     */
    @Test
    public void testCreateGroupMessage() {
            User user = new User("edg", "123");
            Group group = new Group("ig");
            PtoGMessageManager manager = new PtoGMessageManager();
            PtoGMessage message = new PtoGMessage(user, group, "hi");
            PtoGMessage msg = manager.createMessage(user, group, "hi");
            Assert.assertEquals(msg, message);

    }

}