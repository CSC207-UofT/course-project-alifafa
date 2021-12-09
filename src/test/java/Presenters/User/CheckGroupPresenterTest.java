package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckGroupPresenterTest {
    CheckGroupPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new CheckGroupPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setCheckGroupStatus() {
        presenter.setCheckGroupStatus(true);
        assert presenter.inGroup();
    }

    @Test
    public void presentOutput() {
        presenter.setCheckGroupStatus(true);
        assertEquals("You are in this group.", presenter.presentOutput());
    }

    @Test
    public void inGroup() {
        presenter.setCheckGroupStatus(false);
        assertFalse(presenter.inGroup);
    }
}