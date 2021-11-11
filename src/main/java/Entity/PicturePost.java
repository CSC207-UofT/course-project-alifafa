package Entity;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;


public class PicturePost extends ParagraphPost{

    /**
     * A child class of ParagraphPost. Has everything ParagraphPost has.
     * Included pictures attribute which is a list of picture files.
     */

    private List<File> pictures;

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

    public void setPictures(List<File> pictures) {this.pictures = pictures;}

    public List<File> getPictures(){return pictures;}

}