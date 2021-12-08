package Controllers.UserControllers.RemoveAndAddFriend;

import CommandDesignPattern.Receiver;
import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.AddFriendPresenter;
import Presenters.User.CheckFriendPresenter;
import Presenters.User.RemoveFriendPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveFriendControllerTest {

    RemoveFriendController controller;
    RemoveFriendPresenter presenter;
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
        controller = new RemoveFriendController();
        presenter = new RemoveFriendPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeFriend() {
        user.addFriend(friend);
        assert user.getFriends().contains(friend);

        String[] input = {"A", "B"};
        controller.removeFriend(input, presenter);
        assertFalse(user.getFriends().contains(friend));
    }
}