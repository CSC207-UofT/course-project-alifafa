package Entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.HashMap;

/** 
* User Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2021</pre> 
* @version 1.0 
*/ 
public class UserTest { 

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
    *
    * Method: getID()
    *
    */
    @Test
    public void testGetID() {
        User user = new User("1", "a", "123");
        Assert.assertEquals("1", user.getID());
    }

    /**
    *
    * Method: getUserName()
    *
    */
    @Test
    public void testGetUserName() {
        User user = new User("1", "a", "123");
        Assert.assertEquals("a", user.getUserName());
    }

    /**
    *
    * Method: getPassword()
    *
    */
    @Test
    public void testGetPassword() {
        User user = new User("1", "a", "123");
        Assert.assertEquals("123", user.getPassword());
    }

    /**
    *
    * Method: getFriends()
    *
    */
    @Test
    public void testGetFriends() {
        User user1 = new User("1", "a", "123");
        User user2 = new User("2", "b", "123");
        user1.addFriend(user2);
        ArrayList<User> friends = new ArrayList<>();
        friends.add(user2);
        Assert.assertEquals(friends, user1.getFriends());
    }

    /**
    *
    * Method: getMyPosts()
    *
    */
    @Test
    public void testGetMyPosts() {
        User user1 = new User("1", "a", "123");
        ArrayList<ParagraphPost> lst = new ArrayList<>();
        Assert.assertEquals(lst, user1.getMyPosts());

    }

    /*
    *
    * Method: getBlockedUser()
    *

    @Test
    public void testGetBlockedUser() throws Exception {
    }
     */

    /*
    *
    * Method: getAddFriendRequests()
    *

    @Test
    public void testGetAddFriendRequests() throws Exception {
    }
     */

    /**
    *
    * Method: getLoggedIn()
    *
    */
    @Test
    public void testGetLoggedIn() {
        User user1 = new User("1", "a", "123");
        Assert.assertFalse(user1.getLoggedIn());
    }

    /**
    *
    * Method: getSharingCentre()
    *
    */
    @Test
    public void testGetSharingCentre() {
        User user1 = new User("1", "a", "123");
        SharingCentre s = new SharingCentre();
        Assert.assertEquals(s, user1.getSharingCentre());
    }

    /**
    *
    * Method: changeLoggedInStatus()
    *
    */
    @Test
    public void testChangeLoggedInStatus() {
        User user = new User("1", "a", "123");
        boolean begin = user.getLoggedIn();
        user.changeLoggedInStatus();
        boolean end = user.getLoggedIn();
        Assert.assertEquals(begin, !end);
    }

    /*
    *
    * Method: changeUserName(String userName)
    *
    @Test
    public void testChangeUserName() throws Exception {
    }

    *
    * Method: changePassword(String password)
    *
    @Test
    public void testChangePassword() throws Exception {
    }

     */

    /**
    *
    * Method: addFriend(User friend)
    *
    */
    @Test
    public void testAddFriend() {
        User user1 = new User("1", "a", "123");
        User user2 = new User("2", "b", "123");
        user1.addFriend(user2);
        ArrayList<User> friends = new ArrayList<>();
        friends.add(user2);
        Assert.assertEquals(friends, user1.getFriends());
    }

    /*
    *
    * Method: removeFriend(User friend)
    *
    @Test
    public void testRemoveFriend() throws Exception {
    }
     */

    /**
    *
    * Method: addMessage(User user, PtoPMessage message)
    *
    */
    @Test
    public void testAddMessage() {
        User user1 = new User("1", "a", "123");
        User user2 = new User("2", "b", "123");
        user1.addFriend(user2);
        PtoPMessage message = new PtoPMessage(user1, user2, "hi");
        ArrayList<PtoPMessage> first = new ArrayList<>();
        first.add(message);
        user1.addMessage(user2, message);
        HashMap<User, ArrayList<PtoPMessage>> map = new HashMap<>();
        map.put(user1, first);
        Assert.assertEquals(map, user1.PtoPMessageHistory);
    }

    /*
    *
    * Method: getMessage(User user)
    *
    @Test
    public void testGetMessage() throws Exception {
    }

    *
    * Method: deleteMessage(User user, PtoPMessage message)
    *

    @Test
    public void testDeleteMessage() throws Exception {
    }
     */


} 
