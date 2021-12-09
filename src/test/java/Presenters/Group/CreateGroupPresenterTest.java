package Presenters.Group;

import Presenters.Message.CreateGroupPresenter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateGroupPresenterTest {

    CreateGroupPresenter presenter;

    @Before
    public void setUp() {
        presenter = new CreateGroupPresenter();
    }

    @After
    public void tearDown() {
    }


    @Test
    public void presentOutput() {
        presenter.SetCreateStatus(true);
        assertEquals("Your group is successfully created!", presenter.presentOutput());
    }
}