package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddFriendPresenterTest {

    AddFriendPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new AddFriendPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setAddFriendName() {
        presenter.setAddFriendName("Grace");
        assertEquals("Grace", presenter.getFriendName());
    }

    @Test
    public void setStatus() {
        presenter.setStatus("existing friend");
        assertEquals("existing friend", presenter.getStatus());
    }

    @Test
    public void setOutput() {
        presenter.setStatus("existing friend");
        presenter.setOutput();
        assertEquals("You already have this friend! How can you forget about it...", presenter.getOutput());
    }

    @Test
    public void presentOutput() {
        presenter.setStatus("existing friend");
        assertEquals("You already have this friend! How can you forget about it...", presenter.presentOutput());
    }
}