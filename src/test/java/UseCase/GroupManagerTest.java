package UseCase;


import Entity.Message.Group;
import Entity.Message.GroupList;
import Entity.Users.User;
import Entity.Users.UserList;
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
    public void testGetGroup() throws IOException {
        GroupManager manager = new GroupManager();
        GroupList g = new GroupList();
        g.getAllGroups().clear();
        manager.createGroup("rng");
        ArrayList<Group> stored = g.getAllGroups();
        Group g1 = stored.get(0);
        Assert.assertEquals(g1, manager.getGroup("rng"));
    }



/*

    /**
     *
     * Method: addGroupMember(String id, String friendID)
     *
     * /
    @Test
    public void testAddMember() throws IOException {
        GroupManager manager = new GroupManager();
        Group g = new Group("clear");
        User user = new User("rng", "777");
        manager.joinGroup("rng", "clear");
        ArrayList<User> lst = new ArrayList<>();
        lst.add(user);
        ArrayList<User> lst2 = group.getMembers();
        Assert.assertEquals(lst, lst2);
    }
*/

    /**
    *
    * Method: KickGroupMember(String GroupName, String UserName)
    *
    */
    @Test
    public void testKick() throws IOException {
        GroupManager manager = new GroupManager();
        manager.createGroup("rng");
        User u = new User("edg", "123");
        User u1 = new User("g", "123");
        u.addFriend(u1);
        manager.joinGroup("edg", "rng");
        manager.kickGroupMember("rng", "edg");

        Group group = manager.getGroup("rng");
        ArrayList<User> lst = group.getMembers();
        ArrayList<User> lst2 = new ArrayList<>();
        Assert.assertEquals(lst2, lst);
    }

    /**
     *
     * Method: CheckGroup(String UserName, String GroupName)
     *
     */
    @Test
    public void testCheckGroup() throws IOException {
        GroupManager manager = new GroupManager();
        UserManager u = new UserManager();
        manager.createGroup("rng");
        u.createUser("edg", "123");
        manager.joinGroup("edg", "rng");
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
        UserManager mu = new UserManager();
        GroupList g = new GroupList();
        g.getAllGroups().clear();
        UserList u = new UserList();
        u.getAllUsers().clear();
        manager.createGroup("rng");
        mu.createUser("fpx", "123");
        manager.joinGroup("fpx", "rng");
        Assert.assertEquals(g.getAllGroups().get(0).getMembers().get(0), u.getAllUsers().get(0));
    }


}
