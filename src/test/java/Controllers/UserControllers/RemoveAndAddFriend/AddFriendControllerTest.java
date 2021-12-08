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
        user = new User("A", "123");
        list = new UserList();
        list.addUser(user);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addFriend() throws IOException {
        User friend = new User("friend", "000");
        list.addUser(friend);
        String[] input = {"A", "friend"};
        assert user.getFriends().size() == 0;

        controller.addFriend(input, presenter);
        assert user.getFriends().size() == 1;

    }
}