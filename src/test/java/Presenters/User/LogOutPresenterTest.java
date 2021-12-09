package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogOutPresenterTest {

    LogOutPresenter presenter;
    @Before
    public void setUp() throws Exception {
        presenter = new LogOutPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isLoggedIn() {
        presenter.setLogInStatus(false);
        assertFalse(presenter.isLoggedIn());
    }

    @Test
    public void setLogInStatus() {
        presenter.setLogInStatus(true);
        assert(presenter.loggedIn);
    }

    @Test
    public void presentOutput() {
        assertEquals("Your are logged out!", presenter.presentOutput());
    }
}