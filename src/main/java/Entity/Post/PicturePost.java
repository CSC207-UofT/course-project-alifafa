package Entity.Post;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


public class PicturePost implements Serializable, PostReader {

    /**
     * A child class of ParagraphPost. Has everything ParagraphPost has.
     * Included pictures attribute which is a list of picture files.
     */


    private final ParagraphPost paragraphPost;

    /**
     * Creates PicturePost that contains pictures
     *
     * @param POSTTIME    When it is posted
     * @param location    Location
     * @param description Description of the Post
     * @param pictures    List of pictures urls
     */

    public PicturePost(String username, LocalDateTime POSTTIME, String location, String description, List<String> pictures) {
        this.paragraphPost = new ParagraphPost(username, POSTTIME, location, description, pictures);
    }

    @Override
    public String toString() {
        return paragraphPost.toString();
    }

    @Override
    public ParagraphPost getPost() {
        return paragraphPost;
    }
}