package Controllers.UserControllers.RemoveAndAddFriend;

import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.BlockedListPresenter;
import Presenters.User.CheckFriendPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckFriendControllerTest {

    CheckFriendController controller;
    CheckFriendPresenter presenter;
    User user;
    User friend;
    UserList list;

    @Before
    public void setUp() throws Exception {
        user = new User("A", "123");
        friend = new User("B","123");
        list = new UserList();
        list.addUser(user);
        list.addUser(friend);
        controller = new CheckFriendController();
        presenter = new CheckFriendPresenter();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void checkFriend() {
        controller.checkFriend("A", "B", presenter);
        assertEquals("Invalid friend, please re-enter friend username.", presenter.presentOutput());
    }
}