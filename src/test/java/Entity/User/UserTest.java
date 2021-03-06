package Entity.User;

import Entity.Post.ParagraphPost;
import Entity.Post.SharingCentre;
import Entity.Users.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        User user1 = new User("a", "123");
        User user2 = new User("b", "123");
        Assert.assertEquals(String.valueOf(Integer.parseInt(user2.getID())-1), user1.getID());
    }

    /**
    *
    * Method: getUserName()
    *
    */
    @Test
    public void testGetUserName() {
        User user = new User("a", "123");
        Assert.assertEquals("a", user.getUserName());
    }

    /**
    *
    * Method: getPassword()
    *
    */
    @Test
    public void testGetPassword() {
        User user = new User("a", "123");
        Assert.assertEquals("123", user.getPassword());
    }

    /**
    *
    * Method: getFriends()
    *
    */
    @Test
    public void testGetFriends() {
        User user1 = new User("a", "123");
        User user2 = new User("b", "123");
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
        User user1 = new User("a", "123");
        ArrayList<ParagraphPost> lst = new ArrayList<>();
        Assert.assertEquals(lst, user1.getMyPosts());

    }

    /**
    *
    * Method: getBlockedUser()
    *
    */

    @Test
    public void testGetBlockedUser() {
        User user1 = new User("a", "123");
        User user2 = new User("b", "123");
        user1.addBlockedUser(user2);
        ArrayList<User> blocked = new ArrayList<>();
        blocked.add(user2);
        Assert.assertEquals(blocked, user1.getBlockedUser());

    }




    /**
    *
    * Method: getLoggedIn()
    *
    */
    @Test
    public void testGetLoggedIn() {
        User user1 = new User("a", "123");
        Assert.assertFalse(user1.getLoggedIn());
    }

    /**
    *
    * Method: getSharingCentre()
    *
    */
    @Test
    public void testGetSharingCentre() {
        User user1 = new User("a", "123");
        SharingCentre s = new SharingCentre();
        Assert.assertEquals(s.getAllPosts(), user1.getSharingCentre().getAllPosts());
        Assert.assertEquals(s.getNotificationList(), user1.getSharingCentre().getNotificationList());
    }

    /**
    *
    * Method: changeLoggedInStatus()
    *
    */
    @Test
    public void testChangeLoggedInStatus() {
        User user = new User( "a", "123");
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
        User user1 = new User( "a", "123");
        User user2 = new User("b", "123");

        user1.addFriend(user2);
        ArrayList<User> friends = new ArrayList<>();

        friends.add(user2);
        Assert.assertEquals(friends, user1.getFriends());
    }

    /**
     *
     * Method: addFriends(User friend)
     *
     */
    @Test
    public void testAddFriends() {
        User user1 = new User( "a", "123");
        User user2 = new User("b", "123");
        ArrayList<User> friends = new ArrayList<>();

        friends.add(user2);
        user1.addFriends(friends);

        Assert.assertEquals(friends, user1.getFriends());
    }

    /**
     *
     * Method: getAddBlockedUser()
     *
     */

    @Test
    public void testAddBlockedUser() {
        User user1 = new User("a", "123");
        User user2 = new User("b", "123");
        user1.addBlockedUser(user2);
        ArrayList<User> blocked = new ArrayList<>();
        blocked.add(user2);
        Assert.assertEquals(blocked, user1.getBlockedUser());

    }

    /**
     *
     * Method: setPassword()
     *
     */

    @Test
    public void testSetPassword() {
        User user1 = new User("a", "123");
        user1.setPassword("12345");
        Assert.assertEquals("12345", user1.getPassword());

    }

    /**
    *
    * Method: removeFriend(User friend)
    *
    */
    @Test
    public void testRemoveFriend(){
        User user1 = new User( "a", "123");
        User user2 = new User("b", "123");

        user1.addFriend(user2);
        ArrayList<User> friends = new ArrayList<>();
        user1.removeFriend(user2);
        Assert.assertEquals(friends, user1.getFriends());
    }


    /*
    *
    * Method: getAddFriendRequests()
    *

    @Test
    public void testGetAddFriendRequests() {

    }
    */

    /*
    *
    * Method: addMessage(User user, PtoPMessage message)
    *

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
