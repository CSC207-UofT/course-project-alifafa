package UseCase;

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

public class UserManagerTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
    *
    * Method: checkID(String id)
    *
    */
    @Test
    public void testCheckID() {
        UserList store = new UserList();
        store.getAllUsers().clear();
        UserManager manager = new UserManager();
        boolean check = manager.checkID("1");
        Assert.assertTrue(check);
        manager.createUser("1", "a", "123");
        boolean check2 = manager.checkID("1");
        Assert.assertFalse(check2);
    }

    /*
    *
    * Method: checkUserName(String userName)
    *

    @Test
    public void testCheckUserName() throws Exception {
    }
     */

    /**
    *
    * Method: createUser(String id, String userName, String password)
    *
    */
    @Test
    public void testCreateUser() {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("1", "a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        Assert.assertEquals("1", a.getID());
        Assert.assertEquals("a", a.getUserName());
        Assert.assertEquals("123", a.getPassword());
    }

    /*
    *
    * Method: findFriend(String id, String friendID)
    *
    *
    @Test
    public void testFindFriend() throws Exception {
    }
     */

    /**
    *
    * Method: findPassword(String id)
    *
    */
    @Test
    public void testFindPassword() {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("1", "a", "123");
        Assert.assertEquals("123", manager.findPassword("1"));
    }

    /**
    *
    * Method: changeLogInStatus(String id)
    *
    */
    @Test
    public void testChangeLogInStatus() {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("1", "a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        manager.changeLogInStatus("1");
        Assert.assertTrue(a.getLoggedIn());
        manager.changeLogInStatus("1");
        Assert.assertFalse(a.getLoggedIn());
    }

    /**
    *
    * Method: getUser(String id)
    */
    @Test
    public void testGetUser() {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("1", "a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        Assert.assertEquals(a, manager.getUser("1"));
    }

    /*
    *
    * Method: changeUserName(User user, String userName)
    *

    @Test
    public void testChangeUserName() throws Exception {
    }

    /**
    *
    * Method: changePassword(User user, String password)
    *

    @Test
    public void testChangePassword() throws Exception {
    }
     */

    /**
    *
    * Method: addFriend(String id, String friendID)
    *
    */
    @Test
    public void testAddFriend() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("1", "a", "123");
        manager.createUser("2", "b", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        User b = stored.get(1);
        manager.addFriend("1", "2");
        Assert.assertEquals(b, a.getFriends().get(0));
        Assert.assertEquals(a, b.getFriends().get(0));
    }

    /*
    *
    * Method: removeFriend(User user, User friend)
    *
    *
    @Test
    public void testRemoveFriend() throws Exception {
    }

    /**
    *
    * Method: getAddFriendRequests(User user)
    *
    *
    @Test
    public void testGetAddFriendRequests() throws Exception {
    }

     */


    }
