package UseCase;

import Entity.Group;
import Entity.GroupList;
import Entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.IOException;
import java.util.ArrayList;

/**
 * UserManager Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 9, 2021</pre>
 * @version 1.0
 */

public class GroupManagerTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     *
     * Method: checkGroupName(String Name)
     *
     */
    @Test
    public void testCheckGroupName() throws IOException {
        GroupList lst = new GroupList();
        lst.getAllGroups().clear();
        GroupManager manager = new GroupManager();
        boolean check = manager.checkGroupName("edg");
        Assert.assertTrue(check);
        manager.createGroup("edg");
        boolean check2 = manager.checkGroupName("edg");
        Assert.assertFalse(check2);
    }



    /**
     *
     * Method: createGroup(String groupName)
     *
     */
    @Test
    public void testCreateGroup() throws IOException {
        GroupManager manager = new GroupManager();
        GroupList lst = new GroupList();
        lst.getAllGroups().clear();
        manager.createGroup("fpx");
        ArrayList<Group> g = lst.getAllGroups();
        Group g1 = g.get(0);
        Assert.assertEquals("fpx", g1.getGroupName());
    }

    /**
     *
     * Method: getGroupName(String name)
     */
    @Test
    public void testGetGroup() {
        GroupManager manager = new GroupManager();
        Group group = new Group("fpx");
        Group g = manager.getGroup("fpx");
        Assert.assertEquals(group, g);
    }



//    /**
//     *
//     * Method: addGroupMember(String id, String friendID)
//     *
//     */
//    @Test
//    public void testAddMember() throws IOException {
//        GroupManager manager = new GroupManager();
//        Group group = new Group("clear");
//        User user = new User("rng", "777");
//        manager.joinGroup("rng", "clear");
//        ArrayList<User> lst = new ArrayList<>();
//        lst.add(user);
//        ArrayList<User> lst2 = group.getMembers();
//        Assert.assertEquals(lst, lst2);
//    }

    /**
    *
    * Method: KickGroupMember(String GroupName, String UserName)
    *
    */
    @Test
    public void testKick() {
        GroupManager manager = new GroupManager();
        Group rng = new Group( "rng");
        User edg = new User("edg", "123");
        rng.addMember(edg);
        manager.kickGroupMember("rng", "edg");
        ArrayList<User> lst = new ArrayList<>();
        Assert.assertEquals(lst, rng.getMembers());
    }

    /**
     *
     * Method: CheckGroup(String UserName, String GroupName)
     *
     */
    @Test
    public void testCheckGroup()  {
        GroupManager manager = new GroupManager();
        Group rng = new Group( "rng");
        User edg = new User("edg", "123");
        rng.addMember(edg);
        boolean checker = manager.checkGroup("edg", "rng");
        Assert.assertTrue(checker);
    }

    /**
     *
     * Method: JoinGroup(String UserName, String GroupName)
     *
     */
    @Test
    public void testJoinGroup() throws Exception {
        GroupManager manager = new GroupManager();
        Group rng = new Group( "rng");
        User edg = new User("edg", "123");
        manager.joinGroup("edg", "rng");
        ArrayList<User> lst = new ArrayList<>();
        lst.add(edg);
        Assert.assertEquals(lst, rng.getMembers());
    }


}
