package UseCase;

import Entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * PostsManager Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 9, 2021</pre>
 * @version 1.0
 */
public class PostsManagerTest {

    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     *
     * Method: postAPost(User user, String content, String visibleTo, String location, List<File> pictures)
     *
     */
    @Test
    public void testPostAPost() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<File> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        Assert.assertEquals(1, a.getMyPosts().size());
        Assert.assertEquals(1, b.getSharingCentre().getAllPosts().size());
        Assert.assertTrue(b.getSharingCentre().isNewPostNotification());
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        postsManager.postAPost(b, "Haha", "FRIEND", "", pictures);
        Assert.assertTrue(a.getMyPosts().size() < b.getSharingCentre().getAllPosts().size());
    }

    /**
     *
     * Method: deletePost(User user, ParagraphPost post)
     *
     */
    @Test
    public void testDeletePost() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<File> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        Assert.assertEquals(1, a.getMyPosts().size());
        Assert.assertEquals(1, b.getSharingCentre().getAllPosts().size());
        postsManager.deletePost(a, a.getMyPosts().get(0));
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        Assert.assertEquals(0, a.getMyPosts().size());
        Assert.assertEquals(0, b.getSharingCentre().getAllPosts().size());
    }

    /**
     *
     * Method: likePost(User user, ParagraphPost post)
     *
     */
    @Test
    public void testLikePost() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<File> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        postsManager.likePost(b, a.getMyPosts().get(0));
        Assert.assertEquals(1, a.getMyPosts().get(0).getLikes());
        Assert.assertEquals(1, a.getSharingCentre().getNotificationList().size());
        Assert.assertTrue(a.getSharingCentre().getNotificationList().get(0).isLikeNotification());
        postsManager.likePost(a, a.getMyPosts().get(0));
        Assert.assertEquals(2, a.getMyPosts().get(0).getLikes());
    }

    /**
     *
     * Method: commentPost(User user, ParagraphPost post, String comment)
     *
     */
    @Test
    public void testCommentPost() {
        User a = new User("1", "a", "123");
        User b = new User("2", "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<File> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "FRIEND", "", pictures);
        postsManager.commentPost(b, a.getMyPosts().get(0), "WoW");
        Assert.assertEquals(b, a.getSharingCentre().getNotificationList().get(0).getUSER());
        Assert.assertEquals(1, a.getMyPosts().get(0).getComments().get(b).size());
        Assert.assertFalse(a.getSharingCentre().getNotificationList().get(0).isLikeNotification());
    }


} 