package Controllers.UserControllers.RemoveAndAddFriend;

import Controllers.UserControllers.RegistrationAndLogIn.LogOutController;
import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.AddFriendPresenter;
import Presenters.User.LogOutPresenter;
import UIs.RegistrationLogin.AccountRegistrationUI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AddFriendControllerTest {

    AddFriendController controller;
    AddFriendPresenter presenter;
    User user;
    UserList list;

    @Before
    public void setUp() throws Exception {
        controller = new AddFriendController();
        presenter = new AddFriendPresenter();
        user = new User("Aaa", "123");
        list = new UserList();
        list.addUser(user);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addFriend() throws IOException {
        User friend = new User("Gracee", "000");
        list.addUser(friend);
        String[] input = {"Aaa", "Gracee"};
        assertFalse(user.getFriends().contains(friend));

        controller.addFriend(input, presenter);
        assert user.getFriends().contains(friend);

    }
}