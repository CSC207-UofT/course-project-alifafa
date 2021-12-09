package Presenters.Post;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeletePostPresenterTest {

    @Test
    void setDeleteStatus() {
        DeletePostPresenter presenter = new DeletePostPresenter();
        presenter.setDeleteStatus(true);
        assertTrue(presenter.deleted);
    }

    @Test
    void presentOutput() {
        DeletePostPresenter presenter = new DeletePostPresenter();
        presenter.setDeleteStatus(true);
        assertEquals("Deleted post successfully.", presenter.presentOutput());
    }
}