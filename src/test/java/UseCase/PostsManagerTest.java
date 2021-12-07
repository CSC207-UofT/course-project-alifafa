package UseCase;

import Entity.Users.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.IOException;
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
    public void testPostAPost() throws IOException {
        User a = new User( "a", "123");
        User b = new User( "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<String> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "", pictures);
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        Assert.assertEquals(1, a.getMyPosts().size());
        Assert.assertEquals(1, b.getSharingCentre().getAllPosts().size());
        Assert.assertTrue(b.getSharingCentre().isNewPostNotification());
        postsManager.postAPost(a, "Haha", "", pictures);
        postsManager.postAPost(a, "Haha", "", pictures);
        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
        postsManager.postAPost(b, "Haha", "", pictures);
        Assert.assertTrue(a.getMyPosts().size() < b.getSharingCentre().getAllPosts().size());
    }

//    /**
//     *
//     * Method: deletePost(User user, ParagraphPost post)
//     *
//     */
//    @Test
//    public void testDeletePost() throws IOException {
//        User a = new User("a", "123");
//        User b = new User("b", "321");
//        a.addFriend(b);
//        b.addFriend(a);
//        PostsManager postsManager = new PostsManager();
//        List<String> pictures = new ArrayList<>();
//        postsManager.postAPost(a, "Haha", "", pictures);
//        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
//        Assert.assertEquals(1, a.getMyPosts().size());
//        Assert.assertEquals(1, b.getSharingCentre().getAllPosts().size());
//        postsManager.deletePost(a, a.getMyPosts().get(0));
//        Assert.assertTrue(a.getMyPosts().isEmpty());
//        Assert.assertTrue(b.getSharingCentre().getAllPosts().isEmpty());
////        Assert.assertEquals(a.getMyPosts(), b.getSharingCentre().getAllPosts());
////        Assert.assertEquals(0, a.getMyPosts().size());
////        Assert.assertEquals(0, b.getSharingCentre().getAllPosts().size());
//    }

    /**
     *
     * Method: likePost(User user, ParagraphPost post)
     *
     */
    @Test
    public void testLikePost() throws IOException {
        User a = new User( "a", "123");
        User b = new User("b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<String> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "", pictures);
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
    public void testCommentPost() throws IOException {
        User a = new User("a", "123");
        User b = new User( "b", "321");
        a.addFriend(b);
        b.addFriend(a);
        PostsManager postsManager = new PostsManager();
        List<String> pictures = new ArrayList<>();
        postsManager.postAPost(a, "Haha", "", pictures);
        postsManager.commentPost(b, a.getMyPosts().get(0), "WoW");
        Assert.assertEquals(b, a.getSharingCentre().getNotificationList().get(0).getUSER());
        Assert.assertEquals(1, a.getMyPosts().get(0).getComments().size());
        Assert.assertFalse(a.getSharingCentre().getNotificationList().get(0).isLikeNotification());
    }


} 