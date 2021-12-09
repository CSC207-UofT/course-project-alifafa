package Controllers.PostsSharingController.PostCommentAndLike;

import Entity.Post.ParagraphPost;
import Entity.Users.User;
import Presenters.Post.CommentPostPresenter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommentPostControllerTest {
    CommentPostPresenter presenter;
    CommentPostController controller;
    /**
     *
     * Method: runCommentPost
     *
     */
    @Before
    public void setUp() throws Exception {
        controller = new CommentPostController();
        presenter = new CommentPostPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void testRunCommentPost() throws IOException {
        CommentPostController controller = new CommentPostController();
        CommentPostPresenter presenter = new CommentPostPresenter();
        User user = new User("lucas", "123");
        User user2 = new User("A", "123");
        ParagraphPost post = new ParagraphPost(user.getUserName(), LocalDateTime.now(), "sd", "dd");
        ParagraphPost post2 = new ParagraphPost(user2.getUserName(), LocalDateTime.now(), "LOL", "hello");
        controller.runCommentPost(user2.getUserName(), post2.getPostID(), "Wow", presenter);
        controller.runCommentPost(user.getUserName(), post.getPostID(), "hello", presenter);
        assertEquals("The post you are commenting cannot be found.", presenter.presentOutput());
    }
}