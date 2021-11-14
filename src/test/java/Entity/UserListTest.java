package Entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

/**
 * UserList Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 9, 2021</pre>
 * @version 1.0
 */

public class UserListTest {
    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     *
     * Method: addUser()
     *
     */
    @Test
    public void testAddUser() {
        UserList store = new UserList();
        store.getAllUsers().clear();
        User user = new User("1", "a", "123");
        store.addUser(user);
        Assert.assertEquals(user, store.getAllUsers().get(0));
    }

    /**
     *
     * Method: addUsers()
     *
     */
    @Test
    public void testAddUsers() {
        UserList store = new UserList();
        store.getAllUsers().clear();
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "123");
        ArrayList<User> users = new ArrayList<>();
        users.add(a);
        users.add(b);
        store.addUsers(users);
        Assert.assertEquals(a, store.getAllUsers().get(0));
        Assert.assertEquals(b, store.getAllUsers().get(1));
    }

    /**
     *
     * Method: getAllUsers()
     *
     */
    @Test
    public void testGetALLUsers() {
        UserList store = new UserList();
        store.getAllUsers().clear();
        ArrayList<User> lst = new ArrayList<>();
        Assert.assertEquals(lst, store.getAllUsers());
    }


}
