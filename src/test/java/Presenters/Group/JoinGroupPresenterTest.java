package Presenters.Group;

import Presenters.Message.JoinGroupPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JoinGroupPresenterTest {

    JoinGroupPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new JoinGroupPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void presentOutput() {
        presenter.setJoinGroupStatus("You have already joined in this group.");
        presenter.setOutput();
    }
}