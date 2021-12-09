package Controllers.PostsSharingController.PostCommentAndLike;

import Presenters.Post.PostAPostPresenter;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostAPostControllerTest {

    /**
     *
     * Method: runPostAPost
     *
     */
    @Test
    void runPostAPost() throws IOException {
        PostAPostController controller = new PostAPostController();
        PostAPostPresenter presenter = new PostAPostPresenter();
        controller.runPostAPost("lucas", "sd", "dasd", new ArrayList<>(), presenter);
        assertEquals("You have posted successfully!", presenter.presentOutput());
    }
}