package Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParagraphPost {
    private final LocalDateTime POSTTIME;
    private String visibleTo;
    private List<String> comments;
    private String content;
    private final String LOCATION;
    private static int likes;
    protected static int id = 0;
    private final int postid;

    public ParagraphPost(LocalDateTime POSTTIME, String visibleTo, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.content = content;
        this.comments = new ArrayList<String>();
        this.postid = id;
        likes = 0;
        id += 1;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        ParagraphPost.likes = likes;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPOSTTIME() {
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

    public static int getId() {
        return id;
    }

    public int getPostid() {
        return postid;
    }

}
