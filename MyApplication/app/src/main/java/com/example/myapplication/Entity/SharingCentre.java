package com.example.myapplication.Entity;

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