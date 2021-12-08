package Controllers.UserControllers.RegistrationAndLogIn;

import Entity.Users.User;
import Entity.Users.UserList;
import Presenters.User.EditPasswordPresenter;
import UseCase.UserManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EditPasswordControllerTest {

    EditPasswordController controller;
    EditPasswordPresenter presenter;

    @Before
    public void setUp() throws Exception {
        controller = new EditPasswordController();
        presenter = new EditPasswordPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void editPassword() {
        UserManager manager = new UserManager();
        UserList list = new UserList();
        list.addUser(new User("A", "3333"));
        String[] input = {"10", "A"};
        controller.editPassword(input, presenter);
        assertEquals("10",manager.findPassword("A"));
    }
}