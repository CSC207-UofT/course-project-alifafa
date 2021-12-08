package Controllers.UserControllers.RegistrationAndLogIn;

import Entity.Users.UserList;
import Presenters.User.AccountRegistrationPresenter;
import UseCase.UserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AccountRegistrationControllerTest {

    AccountRegistrationController controller;
    AccountRegistrationPresenter presenter;

    @BeforeEach
    void setUp() {
        controller = new AccountRegistrationController();
        presenter = new AccountRegistrationPresenter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createAnAccount() throws IOException {
        String[] userInput = {"Grace", "10", "10"};
        controller.createAnAccount(userInput, presenter);
        UserManager manager = new UserManager();
        assertFalse(manager.checkUserName("Grace"));
        assertEquals(manager.findPassword("Grace"), "10");
    }

    @Test
    void invalidPassword() throws IOException {
        String[] userInput = {"Grace", "10", "11"};
        controller.createAnAccount(userInput, presenter);
        assertEquals("The passwords must match!", presenter.presentOutput());
    }
}