package Entity.Post;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SharingCentre implements Serializable {
    /**
     * A place that contains the posts posted by the user and user's friends,
     * and all notifications the owner of the sharing centre received.
     */

    private final List<ParagraphPost> allPosts;
    private final List<Notifications> notificationList;
    private boolean newPostNotification;

    /**
     * A constructor of sharingCentre.
     */
    public SharingCentre() {
        this.allPosts = new ArrayList<>();
        this.notificationList = new ArrayList<>();
        this.newPostNotification = false;
    }

    // a getter for all posts
    public List<ParagraphPost> getAllPosts() {
        return allPosts;
    }
    // a getter for NotificationList
    public List<Notifications> getNotificationList() {
        return notificationList;
    }
    // a getter for isNewPostNotification
    public boolean isNewPostNotification() {
        return newPostNotification;
    }
    // a setter for NewPostNotification
    public void setNewPostNotification(boolean newPostNotification) {
        this.newPostNotification = newPostNotification;
    }
}
