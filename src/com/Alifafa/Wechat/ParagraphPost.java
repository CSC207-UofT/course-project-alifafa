package com.Alifafa.Wechat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParagraphPost {
    private final Date POSTTIME; // 这玩意儿可以这么写吗, 为啥红了
    private String visibleTo;
    private List comments;
    private ParagraphPost draft;
    private String description;

    public ParagraphPost(Date POSTTIME, String visibleTo, String LOCATION, String description) {
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.description = description;
        this.comments = new ArrayList<String>();
        likes = 0;
        this.draft = new ParagraphPost();
    }

    public ParagraphPost(){

    }


    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public static void setLikes(int likes) {
        ParagraphPost.likes = likes;
    }

    public void setComments(List comments) {
        this.comments = comments;
    }

    public void setDraft(ParagraphPost draft) {
        this.draft = draft;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private final String LOCATION;
    private static int likes;

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

}
