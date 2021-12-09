package Controllers.PostControllers;

import Controllers.PostsSharingController.PostCommentAndLike.CommentPostController;
import Entity.Post.ParagraphPost;
import Entity.Users.User;
import Presenters.Post.CommentPostPresenter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDateTime;

public class CommentPostControllerTest {
    CommentPostController controller;
    CommentPostPresenter presenter;

    @Before
    public void setUp() throws Exception {
        controller = new CommentPostController();
        presenter = new CommentPostPresenter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void commentPost() throws IOException {
        User user = new User("A", "123");
        ParagraphPost post = new ParagraphPost(user.getUserName(), LocalDateTime.now(), "LOL", "hello");
        controller.runCommentPost("A", post.getPostID(), "Wow", presenter);
        Assert.assertEquals(new String[]{"Wow"}, post.getComments());


    }

}
