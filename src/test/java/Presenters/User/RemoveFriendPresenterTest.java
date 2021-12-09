package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveFriendPresenterTest {

    RemoveFriendPresenter presenter;
    @Before
    public void setUp() throws Exception {
        presenter = new RemoveFriendPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setRemoveFriendName() {
        presenter.setRemoveFriendName("Grace");
        assertEquals("Grace", presenter.status);
    }

    @Test
    public void presentOutput() {
        presenter.setRemoveFriendName("Grace");
        assertEquals("You have removed Grace from your friend!", presenter.presentOutput());
    }
}