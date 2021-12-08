package Presenters.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountRegistrationPresenterTest {

    AccountRegistrationPresenter presenter;

    @Before
    public void setUp() {
        presenter = new AccountRegistrationPresenter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void setRegistrationStatus() {
        presenter.setRegistrationStatus(true);
        assert presenter.registrationStatus;
    }

    @Test
    public void setMessage() {
        presenter.setMessage("The password must match");
        assertEquals("The password must match", presenter.message);
    }

    @Test
    public void getRegistrationStatus() {
        presenter.setRegistrationStatus(false);
        assertFalse(presenter.getRegistrationStatus());
    }

    @Test
    public void presentOutput() {
        presenter.setMessage("The password must match");
        assertEquals("The password must match", presenter.presentOutput());
    }
}