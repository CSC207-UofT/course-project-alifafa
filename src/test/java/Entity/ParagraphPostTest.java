package Entity;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** 
* ParagraphPost Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 9, 2021</pre> 
* @version 1.0 
*/ 
public class ParagraphPostTest {

    User a = new User("1", "a", "123");
    ParagraphPost post = new ParagraphPost(LocalDateTime.now(), "LOL", "hello");
    List<String[]> comments = new ArrayList<>();

    /**
    *
    * Method: setLikes(int likes)
    *
    */
    @Test
    public void testSetLikes() {
        post.setLikes(1);
        Assert.assertEquals(1, post.getLikes());
    }

    /**
    *
    * Method: setContent(String content)
    *
    */
    @Test
    public void testSetContent() {
        post.setContent("Hello");
        Assert.assertEquals("Hello", post.getContent());
    }

    /**
    *
    * Method: getPOSTTIME()
    *
    */
    @Test
    public void testGetPOSTTIME() {
        Assert.assertEquals(LocalDateTime.now(), post.getPOSTTIME());
    }

    /**
    *
    * Method: getLOCATION()
    *
    */
    @Test
    public void testGetLOCATION() {
        Assert.assertEquals("LOL", post.getLOCATION());
    }

    /**
    *
    * Method: getLikes()
    *
    */
    @Test
    public void testGetLikes() {
        post.setLikes(1);
        Assert.assertEquals(1, post.getLikes());
    }

    /**
    *
    * Method: getComments()
    *
    */
    @Test
    public void testGetComments() {
        comments.add(new String[]{"lucas", "haha"});
        Assert.assertEquals(1, post.getComments().size());
        Assert.assertEquals("Haha", post.getComments().get(0)[1]);
    }

    /**
    *
    * Method: getContent()
    *
    */
    @Test
    public void testGetContent() {
        post.setContent("Don't look.");
        Assert.assertEquals("Don't look.", post.getContent());
    }

    /**
    *
    * Method: getUsersWhoLiked()
    *
    */
    @Test
    public void testGetUsersWhoLiked() {
        Assert.assertEquals(0, post.getUsersWhoLiked().size());
    }


} 
