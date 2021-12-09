package Controllers.PostsSharingController.PostCommentAndLike;

import Entity.Post.ParagraphPost;
import Entity.Users.User;
import Presenters.Post.CommentPostPresenter;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommentPostControllerTest {

    /**
     *
     * Method: runCommentPost
     *
     */
    @Test
    void testRunCommentPost() throws IOException {
        CommentPostController controller = new CommentPostController();
        CommentPostPresenter presenter = new CommentPostPresenter();
        User user = new User("lucas", "123");
        ParagraphPost post = new ParagraphPost(user.getUserName(), LocalDateTime.now(), "sd", "dd");
        controller.runCommentPost(user.getUserName(), post.getPostID(), "hello", presenter);
        assertEquals("The post you are commenting cannot be found.", presenter.presentOutput());
    }
}