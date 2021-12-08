package Controllers.UserControllers.RegistrationAndLogIn;

import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.LogInPresenter;
import UseCase.UserManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInControllerTest {

    LogInController controller;
    LogInPresenter presenter;

    @Before
    public void setUp() throws Exception {
        controller = new LogInController();
        presenter = new LogInPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void runLogIn() {
        User user = new User("A", "123");
        UserList list = new UserList();
        list.addUser(user);
        String[] input = {"A", "123"};
        controller.runLogIn(input, presenter);
        assert user.getLoggedIn();
    }

    @Test
    public void runLogInFail(){
        User user = new User("A", "123");
        UserList list = new UserList();
        list.addUser(user);
        String[] input = {"A", "12"};
        controller.runLogIn(input, presenter);
        assertFalse(user.getLoggedIn());
    }
}