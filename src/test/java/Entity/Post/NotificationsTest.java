package Entity.Post;

import Entity.Post.Notifications;
import Entity.Post.ParagraphPost;
import Entity.Users.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.time.LocalDateTime;

/** 
* Notifications Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2021</pre> 
* @version 1.0 
*/ 
public class NotificationsTest {
    User a = new User("A", "123");
    ParagraphPost post = new ParagraphPost("A", LocalDateTime.now(), "LOL", "hello");
    Notifications notification = new Notifications(a, LocalDateTime.now(), post, true);

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getUSER() 
* 
*/ 
@Test
public void testGetUSER() {
    Assert.assertEquals(a, notification.getUSER());
} 

/** 
* 
* Method: getTIME() 
* 
*/ 
@Test
public void testGetTIME() {
    Assert.assertEquals(LocalDateTime.now().toLocalDate(), notification.getTIME().toLocalDate());
} 

/** 
* 
* Method: getPOST() 
* 
*/ 
@Test
public void testGetPOST() {
    Assert.assertEquals(post, notification.getPOST());
} 

/** 
* 
* Method: isLikeNotification() 
* 
*/ 
@Test
public void testIsLikeNotification() {
    Assert.assertTrue(notification.isLikeNotification());
} 

/** 
* 
* Method: setLikeNotification(boolean likeNotification) 
* 
*/ 
@Test
public void testSetLikeNotification() {
    notification.setLikeNotification(false);
    Assert.assertFalse(notification.isLikeNotification());
} 


} 
