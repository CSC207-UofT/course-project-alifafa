package com.Alifafa;

import com.Alifafa.User;

import java.util.Date;

public class Notifications {
    private final User user;
    private final Date time;
    private final Post post;

    public Notifications(User user, Date time, Post post) {
        this.user = user;
        this.time = time;
        this.post = post;
    }

}
