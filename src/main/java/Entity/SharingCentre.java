package Entity;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

public class SharingCentre {
    private List<ParagraphPost> allPosts;
    private List<Notification> notificationList;
    private boolean newPostNotification;

    public SharingCentre() {
        this.allPosts = new ArrayList<ParagraphPost>();
        this.notificationList = new ArrayList<Notification>();
        this.newPostNotification = false;
    }

    public List<ParagraphPost> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(List<ParagraphPost> allPosts) {
        this.allPosts = allPosts;
    }

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public boolean isNewPostNotification() {
        return newPostNotification;
    }

    public void setNewPostNotification(boolean newPostNotification) {
        this.newPostNotification = newPostNotification;
    }
}
