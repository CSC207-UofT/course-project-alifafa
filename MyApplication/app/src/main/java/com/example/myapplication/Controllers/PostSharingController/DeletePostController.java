package com.example.myapplication.Controllers.PostSharingController;

import com.example.myapplication.InputBoundary.SharingCentreInputBoundary;
import com.example.myapplication.Presenters.DeletePostPresenter;
import com.example.myapplication.UseCase.PostsManager;

public class DeletePostController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Asks the use case to perform post deletion
     * @param userid The id of the user that wants to delete the post
     * @param postID The post to be deleted
     * @param presenter DeletePostPresenter
     */
    public void runDeletePost(String userid, String postID, DeletePostPresenter presenter) {
        sharingInputBoundary.runDeletePost(userid, postID, presenter);
    }
}