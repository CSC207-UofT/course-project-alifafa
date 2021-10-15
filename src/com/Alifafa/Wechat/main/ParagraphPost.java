package com.Alifafa.Wechat.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParagraphPost {
    private final Date POSTTIME;
    private List editHistory;   // TODO: Didn't understand why we need this and what's it for
    /** TODO: Is <visibleTo> a string or a boolean value or some obj? In Wechat,
     *   we can choose who can see the post and how many days the post can be seen
     *    by others.
     */
    private String visibleTo;
    private List comments;
    private List draftList;
    private String content;
    private final String LOCATION;
    private static int likes;

    public ParagraphPost(Date POSTTIME, String visibleTo, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.visibleTo = visibleTo;
        this.LOCATION = LOCATION;
        this.content = content;
        this.editHistory = new ArrayList<>();
        this.comments = new ArrayList<String>();
        likes = 0;
        this.draftList = new ArrayList<ParagraphPost>();
    }

    public void setEditHistory(List editHistory) {
        this.editHistory = editHistory;
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

    public void setDraftList(List draftList) {
        this.draftList = draftList;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPOSTTIME() {
        return POSTTIME;
    }

    public List getEditHistory() {
        return editHistory;
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

    public List getDraftList() {
        return draftList;
    }

    public String getContent() {
        return content;
    }

}
