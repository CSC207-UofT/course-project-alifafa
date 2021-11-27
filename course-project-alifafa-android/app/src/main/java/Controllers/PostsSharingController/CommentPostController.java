package Controllers.PostsSharingController;

import InputBoundary.SharingCentreInputBoundary;
import Presenters.CommentPostPresenter;
import UseCase.PostsManager;

public class CommentPostController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Pass these parameters to the use case and comment a post.
     * @param userid The id of user who comments
     * @param postID The specific post the user wants to comment on
     * @param content The comment the user writes
     * @param presenter CommentPostPresenter
     */
    public void runCommentPost(String userid, String postID, String content, CommentPostPresenter presenter) {
        sharingInputBoundary.runCommentPost(userid, postID, content, presenter);
    }
}
