package Entity;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;


public class PicturePost extends ParagraphPost{
    private String visibleTo;
    private List<String> comments;
    private String content;
    private List<File> pictures;
    private static int likes;

    public PicturePost(LocalDateTime posttime, String visibleTo, String location, String description, List<File> pictures){
        super(posttime, visibleTo, location, description);
        this.pictures = pictures;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        PicturePost.likes = likes;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPictures(List<File> pictures) {this.pictures = pictures;}


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

    public List<String> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public List<File> getPictures(){return pictures;}

}