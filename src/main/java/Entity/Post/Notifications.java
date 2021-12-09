package Entity.Post;

import Entity.Users.User;

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
    // get the user of notifications
    public User getUSER() {
        return USER;
    }
    // get the time of notifications
    public LocalDateTime getTIME() {
        return TIME;
    }
    // get the post of notifications
    public ParagraphPost getPOST() {
        return POST;
    }
    // get if the notification is liked
    public boolean isLikeNotification() {
        return likeNotification;
    }
    // set the likes of the notification
    public void setLikeNotification(boolean likeNotification) {
        this.likeNotification = likeNotification;
    }

    public String toString() {
        String postID = POST.getPostID();
        String statement;
        if (likeNotification) {
            statement = "liked your post: ";
        } else {
            statement = "commented your post: ";
        }
        return "'" + USER.getUserName() + "' " + statement + postID + "\n\tWhen: " + TIME;
    }
}
