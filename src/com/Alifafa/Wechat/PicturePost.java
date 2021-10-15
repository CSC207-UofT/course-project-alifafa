package com.Alifafa.Wechat;

import javax.management.Notification;
import javax.sql.PooledConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;



public class PicturePost extends ParagraphPost{
    private final Date POSTTIME;
    private String visibleTo;
    private List comments;
    private PicturePost draft;
    private String description;
    private List pictures;
    private final String LOCATION;
    private static int likes;

    public PicturePost(Date POSTTIME, String visibleTo, String LOCATION, String description, List pictures){
        super();
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.description = description;
        this.comments = new ArrayList<String>();
        likes = 0;
        this.draft = new PicturePost();
        this.pictures = pictures;

    }

    public PicturePost(){}

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        PicturePost.likes = likes;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }

    public void setDraft(PicturePost draft) {
        this.draft = draft;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictures(List pictures) {this.pictures = pictures;}


    public Date getPOSTTIME() {
        return POSTTIME;
    }

    public String getVisibleTo() {
        return visibleTo;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public static int getLikes() {
        return likes;
    }

    public List getComments() {
        return comments;
    }

    public ParagraphPost getDraftList() {
        return draft;
    }

    public String getDescription() {
        return description;
    }

    public List getPictures(){return pictures;}

}

}
