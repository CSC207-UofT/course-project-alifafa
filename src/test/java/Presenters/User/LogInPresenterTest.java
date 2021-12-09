package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInPresenterTest {

    LogInPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LogInPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setLogInStatus() {
        presenter.setLogInStatus(true);
        assert presenter.isLoggedIn();
    }

    @Test
    public void isLoggedIn() {
        presenter.setLogInStatus(false);
        assertFalse(presenter.isLoggedIn());
    }

    @Test
    public void presentOutput() {
        presenter.setLogInStatus(true);
        assertEquals("Your are logged in!", presenter.presentOutput());
    }
}