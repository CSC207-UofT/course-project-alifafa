package Controllers.UserControllers.RemoveAndAddFriend;

import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.AddFriendPresenter;
import Presenters.User.BlockedListPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BlockedListControllerTest {
    BlockedListController controller;
    BlockedListPresenter presenter;
    User user;
    User blocked;
    UserList list;


    @Before
    public void setUp() throws Exception {
        user = new User("A", "123");
        blocked = new User("B","123");
        list = new UserList();
        list.addUser(user);
        list.addUser(blocked);
        controller = new BlockedListController();
        presenter = new BlockedListPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBlocked() throws IOException {
        String[] input = {"A", "B"};
        controller.addBlocked(input, presenter);
        assert user.getBlockedUser().contains(blocked);
    }

    @Test
    public void checkBlocked() {
        user.addBlockedUser(blocked);
        String[] input = {"B", "A"};
        assert controller.checkBlocked(input);
    }
}