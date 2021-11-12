package Entity;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Notifications implements Serializable {
    /**
     * An entity that contains the user who and when liked or commented a
     * post.
     */

    private final User USER;
    private final LocalDateTime TIME;
    private final ParagraphPost POST;
    private boolean likeNotification;   // true if it's a notification that someone liked your post
                                        // false if it's a notification that someone commented

    /**
     * Constructor of Notifications.
     * @param user Who liked or commented
     * @param time When the post is liked or commented
     * @param post Which is liked or commented
     * @param like True if someone liked the post, false if the post was commented
     */
    public Notifications(User user, LocalDateTime time, ParagraphPost post, boolean like) {
        this.USER = user;
        this.TIME = time;
        this.POST = post;
        this.likeNotification = like;
    }

    public User getUSER() {
        return USER;
    }

    public LocalDateTime getTIME() {
        return TIME;
    }

    public ParagraphPost getPOST() {
        return POST;
    }

    public boolean isLikeNotification() {
        return likeNotification;
    }

    public void setLikeNotification(boolean likeNotification) {
        this.likeNotification = likeNotification;
    }

}
