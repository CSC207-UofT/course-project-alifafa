package Presenters.Group;

import Presenters.Message.KickGroupMemberPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KickGroupPresenterTest {

    KickGroupMemberPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new KickGroupMemberPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void presentOutput() {
        presenter.setGroupName("edg.");
        presenter.setRemoveUsername("ig.");
        assertEquals("You have kicked ig. from edg.!", presenter.presentOutput());
    }
}