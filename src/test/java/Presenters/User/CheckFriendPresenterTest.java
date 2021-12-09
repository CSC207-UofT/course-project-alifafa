package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckFriendPresenterTest {

    CheckFriendPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new CheckFriendPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setCheckFriendStatus() {
        presenter.setCheckFriendStatus(false);
        assertFalse(presenter.isFriend());
    }

    @Test
    public void presentOutput() {
        presenter.setCheckFriendStatus(false);
        assertEquals("Invalid friend, please re-enter friend username.", presenter.presentOutput());
    }

    @Test
    public void isFriend() {
        presenter.setCheckFriendStatus(true);
        assert (presenter.isFriend());
    }
}