package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockedListPresenterTest {

    BlockedListPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new BlockedListPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setAddBlockedStatus() {
        presenter.setAddBlockedStatus("A");
        assertEquals("You have added A into your blocked list!",presenter.presentOutput());
    }

    @Test
    public void presentOutput() {
        presenter.setAddBlockedStatus("friend");
        assertEquals("You have added friend into your blocked list!",presenter.presentOutput());
    }
}