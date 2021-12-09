package UIs.RegistrationLogin;

import Controllers.UserControllers.RegistrationAndLogIn.AccountRegistrationController;
import Presenters.User.AccountRegistrationPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AccountRegistrationUITest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    AccountRegistrationUI myUI;
    AccountRegistrationController controller;
    AccountRegistrationPresenter presenter;

    @Before
    public void setUp() {
        myUI = new AccountRegistrationUI();
        controller = new AccountRegistrationController();
        presenter = new AccountRegistrationPresenter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void run() throws IOException {
        String[] input = {"Lisa", "A", "A"};
        controller.createAnAccount(input, presenter);
        System.out.print(presenter.presentOutput());
        assertEquals("Your account is successfully created!", outContent.toString());

    }
}