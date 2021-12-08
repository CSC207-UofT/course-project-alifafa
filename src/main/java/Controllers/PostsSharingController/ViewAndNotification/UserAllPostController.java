package Controllers.PostsSharingController.ViewAndNotification;

import InputBoundary.SharingCentreInputBoundary;
import Presenters.Post.SharingCentrePresenter;
import UseCase.PostsManager;

public class UserAllPostController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Pass the user's id to the use case and asks the presenter to return all
     * remaining posts this user posted.
     * @param userid The user's specific id
     * @param presenter The SharingCentrePresenter
     */
    public void runRetrieveUserAllPost(String userid, SharingCentrePresenter presenter) {
        sharingInputBoundary.retrieveUsersAllPosts(userid, presenter);
    }

}
