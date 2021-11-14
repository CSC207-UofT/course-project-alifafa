package Entity;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* User Tester.
*
* @author <Authors name>
* @since <pre>Nov 10, 2021</pre>
* @version 1.0
*/
public class UserTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: getID()
    *
    */
    @Test
    public void testGetID() throws Exception {
        User user = new User("1", "a", "123");
        Assert.assertEquals("1", user.getID())
    }

    /**
    *
    * Method: getUserName()
    *
    */
    @Test
    public void testGetUserName() throws Exception {
        User user = new User("1", "a", "123");
        Assert.assertEquals("a", user.getUserName())
    }

    /**
    *
    * Method: getPassword()
    *
    */
    @Test
    public void testGetPassword() throws Exception {
        User user = new User("1", "a", "123");
        Assert.assertEquals("123", user.getPassword())
    }

    /**
    *
    * Method: getFriends()
    *
    */
    @Test
    public void testGetFriends() throws Exception {
        User user1 = new User("1", "a", "123");
        User user2 = new User("2", "b", "123");
        user1.addFriend(user2)
        ArrayList friends = new Arraylist<>();
        friends.add(user2)
        Assert.assertEquals(friends, user1.getFriends())
    }

    /**
    *
    * Method: getMyPosts()
    *
    */
    @Test
    public void testGetMyPosts() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getBlockedUser()
    *
    */
    @Test
    public void testGetBlockedUser() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getAddFriendRequests()
    *
    */
    @Test
    public void testGetAddFriendRequests() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getLoggedIn()
    *
    */
    @Test
    public void testGetLoggedIn() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getSharingCentre()
    *
    */
    @Test
    public void testGetSharingCentre() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: changeLoggedInStatus()
    *
    */
    @Test
    public void testChangeLoggedInStatus() throws Exception {
        User user = new User("1", "a", "123");
        Boolean begin = user.getLoggedIn();
        Boolean end = user.changeLoggedInStatus()
        Assert.assertTrue(begin == not end)
    }

    /**
    *
    * Method: changeUserName(String userName)
    *
    */
    @Test
    public void testChangeUserName() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: changePassword(String password)
    *
    */
    @Test
    public void testChangePassword() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: addFriend(User friend)
    *
    */
    @Test
    public void testAddFriend() throws Exception {
        User user1 = new User("1", "a", "123");
        User user2 = new User("2", "b", "123");
        user1.addFriend(user2)
        ArrayList friends = new Arraylist<>();
        friends.add(user2);
        Assert.assertEquals(friends, user1.getFriends());
    }

    /**
    *
    * Method: removeFriend(User friend)
    *
    */
    @Test
    public void testRemoveFriend() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: addMessage(User user, PtoPMessage message)
    *
    */
    @Test
    public void testAddMessage() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getMessage(User user)
    *
    */
    @Test
    public void testGetMessage() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: deleteMessage(User user, PtoPMessage message)
    *
    */
    @Test
    public void testDeleteMessage() throws Exception {
    //TODO: Test goes here...
    }


}
