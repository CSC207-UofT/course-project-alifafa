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
    * Method: checkUsername(String username)
    *
    */
    @Test
    public void testCheckUsername() throws IOException {
        UserList store = new UserList();
        store.getAllUsers().clear();
        UserManager manager = new UserManager();
        manager.createUser("a", "123");
        Assert.assertFalse(manager.checkUserName("a"));
        boolean check2 = manager.checkUserName("n");
        Assert.assertTrue(check2);
    }

    /*
    *
    * Method: checkID(String iD)
    */



    /**
    *
    * Method: createUser(String userName, String password)
    *
    */
    @Test
    public void testCreateUser() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        Assert.assertEquals("a", a.getUserName());
        Assert.assertEquals("123", a.getPassword());
    }



    /**
    *
    * Method: findPassword(String username)
    *
    */
    @Test
    public void testFindPassword() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser( "a", "123");
        Assert.assertEquals("123", manager.findPassword("a"));
    }

    /**
    *
    * Method: changeLogInStatus(String username)
    *
    */
    @Test
    public void testChangeLogInStatus() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser( "a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        manager.changeLogInStatus("a");
        Assert.assertTrue(a.getLoggedIn());
        manager.changeLogInStatus("a");
        Assert.assertFalse(a.getLoggedIn());
    }

    /**
    *
    * Method: getUser(String username)
    */
    @Test
    public void testGetUser() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        Assert.assertEquals(a, manager.getUser("a"));
    }

    /*
    *
    * Method: changeUserName(User user, String userName)

    @Test
    public void testChangeUserName() throws Exception {
    }

     */

    /**
    *
    * Method: editPassword(User user, String password)
    */

    @Test
    public void testEditPassword() throws Exception {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        Assert.assertEquals("123", manager.findPassword("a"));
        manager.editPassword("321", "a");
        Assert.assertEquals("321", manager.findPassword("a"));
    }


    /**
    *
    * Method: addFriend(String username, String friendUsername)
    *
    */
    @Test
    public void testAddFriend() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        manager.createUser("b", "123");
        ArrayList<User> stored = store.getAllUsers();
        User a = stored.get(0);
        User b = stored.get(1);
        manager.addFriend("a", "b");
        Assert.assertEquals(b, a.getFriends().get(0));
        Assert.assertEquals(a, b.getFriends().get(0));
    }

    @Test
    public void testCheckFriend() throws IOException {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        manager.createUser("b", "123");
        ArrayList<User> stored = store.getAllUsers();
        manager.addFriend("a", "b");
        Assert.assertTrue(manager.checkFriend("a", "b"));
    }




    /**
    *
    * Method: removeFriend(User user, User friend)
    *
    */
    @Test
    public void testRemoveFriend() throws Exception {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        manager.createUser("b", "123");
        manager.addFriend("a", "b");
        Assert.assertTrue(manager.checkFriend("a", "b"));
        manager.removeFriend("a", "b");
        Assert.assertFalse(manager.checkFriend("a", "b"));
    }

    /**
    *
    * Method: addBlockedUser(String id, String friendID)
    *
    */
    @Test
    public void testAddBlockedUser() throws Exception {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();
        manager.createUser("a", "123");
        manager.createUser("b", "123");
        Assert.assertFalse(manager.isBlocked("a", "b"));
        manager.addBlockedUser("a", "b");
        Assert.assertTrue(manager.isBlocked("b", "a"));

    /*
    *
    * Method: getAddFriendRequests(User user)
    *
    *
    @Test
    public void testGetAddFriendRequests() throws Exception {
        UserManager manager = new UserManager();
        UserList store = new UserList();
        store.getAllUsers().clear();

    }*/


    }
}
