package Presenters.Post;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentPostPresenterTest {

    CommentPostPresenter commentPostPresenter = new CommentPostPresenter();
    @Test
    void setCommented() {
        commentPostPresenter.setCommented(true);
    }

    @Test
    void presentOutput() {
        commentPostPresenter.setCommented(true);
        assertEquals("Commented successfully.", commentPostPresenter.presentOutput());
    }

    @Test
    void presentOutput1() {
        commentPostPresenter.setCommented(false);
        assertEquals("The post you are commenting cannot be found.", commentPostPresenter.presentOutput());
    }
}