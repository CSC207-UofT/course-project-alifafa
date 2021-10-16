package Entity;

import java.util.List;
import java.util.Date;



public class PicturePost extends ParagraphPost{
    private String visibleTo;
    private List comments;
    private PicturePost draft;
    private String description;
    private List pictures;
    private static int likes;

    public PicturePost(Date posttime, String visibleTo, String location, String description, List pictures, int postid){
        super(posttime, visibleTo, location, description, postid);
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

    public void setDraft(PicturePost draft) {
        this.draft = draft;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictures(List pictures) {this.pictures = pictures;}


    public Date getPOSTTIME() {
        return POSTTIME;
    }

    public String getVisibleTo() {

        return visibleTo;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public static int getLikes() {
        return likes;
    }

    public List getComments() {
        return comments;
    }

    public ParagraphPost getDraftList() {
        return draft;
    }

    public String getDescription() {
        return description;
    }

    public List getPictures(){return pictures;}

}