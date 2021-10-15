package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParagraphPost {
    private final Date POSTTIME;
    private String visibleTo;
    private List<String> comments;
    private String content;
    private final String LOCATION;
    private static int likes;

    public ParagraphPost(Date POSTTIME, String visibleTo, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.content = content;
        this.comments = new ArrayList<String>();
        likes = 0;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        ParagraphPost.likes = likes;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

    public String getContent() {
        return content;
    }

}
