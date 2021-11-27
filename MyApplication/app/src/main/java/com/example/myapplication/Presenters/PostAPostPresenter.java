package com.example.myapplication.Presenters;


import com.example.myapplication.OutputBoundary.PostAPostOutputBoundary;

public class PostAPostPresenter implements PostAPostOutputBoundary {
    boolean posted;

    @Override
    public void setPostStatus(boolean posted) {
        this.posted = posted;
    }

    @Override
    public String presentOutput() {
        if (!posted) {
            return ("You can't post an empty post. Please enter some " +
                    "information for either content or picture");
        }
        return ("You have posted successfully!");
    }

}