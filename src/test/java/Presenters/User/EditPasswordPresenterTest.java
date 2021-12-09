package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EditPasswordPresenterTest {

    EditPasswordPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new EditPasswordPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setEdited() {
        presenter.setEdited(true);
        assertEquals("You have edited your password!", presenter.presentOutput());
    }

    @Test
    public void presentOutput() {
        presenter.setEdited(false);
        assertEquals("unsuccessful", presenter.presentOutput());
    }
}