package Controllers.UserControllers.RegistrationAndLogIn;

import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.LogOutPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogOutControllerTest {

    LogOutController controller;
    LogOutPresenter presenter;
    User user;
    UserList list;

    @Before
    public void setUp() throws Exception {
        presenter = new LogOutPresenter();
        controller = new LogOutController();
        user = new User("A", "123");
        list = new UserList();
        list.addUser(user);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void runLogOut() {

        assertFalse(user.getLoggedIn());

        user.changeLoggedInStatus();
        assert user.getLoggedIn();

        controller.runLogOut("A");
        assertFalse(user.getLoggedIn());
    }
}