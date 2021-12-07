package Entity;

import Entity.Post.PicturePost;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** 
* PicturePost Tester. 
* 
* @author <Authors name> 
* @since <pre>Nov 10, 2021</pre> 
* @version 1.0 
*/ 
public class PicturePostTest { 
    List<String> urls = new ArrayList<>();
    PicturePost post = new PicturePost("a", LocalDateTime.now(), "LoL", "Hello", urls);

@Before
public void before() {
} 

@After
public void after() {
} 


/** 
* 
* Method: getPictures() 
* 
*/ 
@Test
public void testGetPictures() {
    String url = "https://";
    urls.add(url);
    Assert.assertEquals(1, post.getPictures().size());
} 


} 
