package Entity;

import Entity.Post.Notifications;
import Entity.Post.ParagraphPost;
import Entity.Users.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

/** 
* SharingCentre Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2021</pre> 
* @version 1.0 
*/ 
public class SharingCentreTest {

    User a = new User("1", "a", "123");
    User b = new User("2", "b", "321");
    ParagraphPost post = new ParagraphPost(LocalDateTime.now(), "LOL", "hello");
    ParagraphPost post1 = new ParagraphPost(LocalDateTime.now(), "", "dd");
    Notifications notifications = new Notifications(a, LocalDateTime.now(), post, true);
    Notifications notifications1 = new Notifications(a, LocalDateTime.now(), post1, false);

@Before
public void before() {

}

@After
public void after() {
} 

/** 
* 
* Method: getAllPosts() 
* 
*/ 
@Test
public void testGetAllPosts() {
    ParagraphPost post = new ParagraphPost(LocalDateTime.now(), "LOL", "hello");
    ParagraphPost post1 = new ParagraphPost(LocalDateTime.now(), "", "dd");
    a.getSharingCentre().getAllPosts().add(post);
    a.getSharingCentre().getAllPosts().add(post1);
    int size = a.getSharingCentre().getAllPosts().size();
    Assert.assertEquals(2, size);
} 

/** 
* 
* Method: getNotificationList() 
* 
*/ 
@Test
public void testGetNotificationList() {
    a.getSharingCentre().getNotificationList().add(notifications);
    a.getSharingCentre().getNotificationList().add(notifications1);
    int size = a.getSharingCentre().getNotificationList().size();
    Assert.assertEquals(2, size);
}

/** 
* 
* Method: isNewPostNotification() 
* 
*/ 
@Test
public void testIsNewPostNotification() {
    b.getSharingCentre().setNewPostNotification(false);
    Assert.assertFalse(b.getSharingCentre().isNewPostNotification());
    a.getSharingCentre().setNewPostNotification(true);
    Assert.assertTrue(a.getSharingCentre().isNewPostNotification());
} 

/** 
* 
* Method: setNewPostNotification(boolean newPostNotification) 
* 
*/ 
@Test
public void testSetNewPostNotification() {
    b.getSharingCentre().setNewPostNotification(false);
    Assert.assertFalse(b.getSharingCentre().isNewPostNotification());
} 


} 
