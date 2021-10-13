package com.Alifafa.Wechat;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

public class SharingCentre {
    private List<Post> allPosts;
    private List<Notification> notificationList;
    private boolean newPostNotification;

    public SharingCentre() {
        this.allPosts = new ArrayList<Post>();
        this.notificationList = new ArrayList<Notification>();
        this.newPostNotification = false;
    }

    public List<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(List<Post> allPosts) {
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
