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

    public PicturePost(LocalDateTime posttime, String location, String description, List<File> pictures){
        super(posttime, location, description);
        this.pictures = pictures;
    }

    public void setPictures(List<File> pictures) {this.pictures = pictures;}

    public List<File> getPictures(){return pictures;}

}