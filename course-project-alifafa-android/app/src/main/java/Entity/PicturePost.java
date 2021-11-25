package Entity;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


public class PicturePost extends ParagraphPost implements Serializable {

    /**
     * A child class of ParagraphPost. Has everything ParagraphPost has.
     * Included pictures attribute which is a list of picture files.
     */

    private final List<File> pictures;

    /**
     * Creates PicturePost that contains pictures
     * @param POSTTIME When it is posted
     * @param location Location
     * @param description Description of the Post
     * @param pictures List of pictures
     */

    public PicturePost(LocalDateTime POSTTIME, String location, String description, List<File> pictures){
        super(POSTTIME, location, description);
        this.pictures = pictures;
    }

    public List<File> getPictures(){return pictures;}

}