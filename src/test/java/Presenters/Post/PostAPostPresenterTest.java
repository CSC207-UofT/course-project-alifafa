package Presenters.Post;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostAPostPresenterTest {

    PostAPostPresenter postAPostPresenter = new PostAPostPresenter();

    @Test
    void presentOutput() {
        assertEquals("You can't post an empty post. Please enter some " +
                "information for either content or picture",postAPostPresenter.presentOutput());
    }

    @Test
    void presentOutput1() {
        postAPostPresenter.setPostStatus(true);
        assertEquals("You have posted successfully!",postAPostPresenter.presentOutput());
    }
}