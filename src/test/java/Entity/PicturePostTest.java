package Entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.File;
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
    List<File> files = new ArrayList<>();
    PicturePost post = new PicturePost(LocalDateTime.now(), "LoL", "Hello", files);

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
    File file = new File("dd");
    files.add(file);
    Assert.assertEquals(1, post.getPictures().size());
} 


} 
