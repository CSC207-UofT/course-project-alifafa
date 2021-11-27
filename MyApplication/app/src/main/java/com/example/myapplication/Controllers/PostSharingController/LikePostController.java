package com.example.myapplication.Controllers.PostSharingController;

import com.example.myapplication.InputBoundary.SharingCentreInputBoundary;
import com.example.myapplication.UseCase.PostsManager;

public class LikePostController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Asks the use case to perform a user likes a post
     * @param userid The id of user who likes the post
     * @param postID The post to be liked
     */
    public void runLikesPost(String userid, String postID) {
        sharingInputBoundary.likeAPost(userid, postID);
    }
}
