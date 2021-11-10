package Entity;

import java.util.Date;

public class Notifications {
    private final User USER;
    private final Date TIME;
    private final ParagraphPost POST;
    private boolean likeNotification;   // true if it's a notification that someone liked your post
                                        // false if it's a notification that someone commented


    public Notifications(User user, Date time, ParagraphPost post, boolean like) {
        this.USER = user;
        this.TIME = time;
        this.POST = post;
        this.likeNotification = like;
    }

    public User getUSER() {
        return USER;
    }

    public Date getTIME() {
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
