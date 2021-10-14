package com.Alifafa.Wechat;

import java.util.Date;

public class Notifications {
    private final User USER;
    private final Date TIME;
    private final ParagraphPost POST;

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

    private boolean likeNotification;



}
