package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A paragraph post contains the following information:
 * - post time
 * - visibility
 * - comments
 * - likes
 * - description
 * - location
 *
 * Responsibility: creates a paragraph post and store post information
 */

public class ParagraphPost {
    protected Date POSTTIME;
    private String visibleTo;
    private List<String> comments;
    private String description;
    protected String LOCATION;
    private static int likes;
    private final int POSTID;

    /**
     *
     * @param POSTTIME : when the post was posted
     * @param visibleTo : who can see the post
     * @param LOCATION : where the post was posted
     * @param description : post description
     */

    public ParagraphPost(Date POSTTIME, String visibleTo, String LOCATION, String description, int POSTID) {
        /**
         * constructs a paragraph post containing the following information
         */
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.description = description;
        this.comments = new ArrayList<String>();
        this.POSTID = POSTID;
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

    public void setDescription(String description) {
        this.description = description;
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

    public String getDescription() {
        return description;
    }

}
