package Entity;

import java.time.LocalDateTime;
import java.util.List;


public class PicturePost extends ParagraphPost{
    private String visibleTo;
    private List<String> comments;
    private String description;
    private List pictures;
    private static int likes;

    public PicturePost(LocalDateTime posttime, String visibleTo, String location, String description, List pictures){
        super(posttime, visibleTo, location, description);
        this.pictures = pictures;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        PicturePost.likes = likes;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictures(List pictures) {this.pictures = pictures;}


    public LocalDateTime getPOSTTIME() {
        return super.getPOSTTIME();
    }

    public String getVisibleTo() {

        return visibleTo;
    }

    public String getLOCATION() {
        return super.getLOCATION();
    }

    public static int getLikes() {
        return likes;
    }

    public List getComments() {
        return comments;
    }

    public String getDescription() {
        return description;
    }

    public List getPictures(){return pictures;}

}