package Entity;

import java.util.ArrayList;
import java.util.List;

public class SharingCentre {
    private final List<ParagraphPost> allPosts;
    private final List<Notifications> notificationList;
    private boolean newPostNotification;

    public SharingCentre() {
        this.allPosts = new ArrayList<ParagraphPost>();
        this.notificationList = new ArrayList<Notifications>();
        this.newPostNotification = false;
    }

    public List<ParagraphPost> getAllPosts() {
        return allPosts;
    }

    public List<Notifications> getNotificationList() {
        return notificationList;
    }

    public boolean isNewPostNotification() {
        return newPostNotification;
    }

    public void setNewPostNotification(boolean newPostNotification) {
        this.newPostNotification = newPostNotification;
    }
}
