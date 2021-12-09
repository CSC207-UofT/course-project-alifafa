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
        user = new User("AAB", "123");
        blocked = new User("BBB","123");
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
        User blockedTwo = new User("CCC", "123");
        User newUser = new User("PPP", "123");
        list.addUser(newUser);
        list.addUser(blockedTwo);
        String[] input = {"PPP", "CCC"};
        controller.addBlocked(input, presenter);
        assert newUser.getBlockedUser().contains(blockedTwo);
    }

    @Test
    public void checkBlocked() {
        user.addBlockedUser(blocked);
        String[] input = {"BBB", "AAB"};
        assert controller.checkBlocked(input);
    }
}