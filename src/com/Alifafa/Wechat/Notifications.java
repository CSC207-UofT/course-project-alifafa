package com.Alifafa.Wechat;

import java.util.Date;

public class Notifications {
    private final User user;
    private final Date time;
    private final Post post;
    private boolean likeNotification;

    public Notifications(User user, Date time, Post post, boolean like) {
        this.user = user;
        this.time = time;
        this.post = post;
        this.likeNotification = like;
    }

}
