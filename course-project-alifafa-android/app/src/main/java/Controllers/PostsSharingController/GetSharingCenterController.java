package Controllers.PostsSharingController;

import InputBoundary.SharingCentreInputBoundary;
import Presenters.SharingCentrePresenter;
import UseCase.PostsManager;

public class GetSharingCenterController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Pass user's id to the use case and asks the presenter to return all the
     * posts inside his/her sharing centre.
     * @param userid The id of the user
     * @param presenter The SharingCentre Presenter
     */
    public void runRetrieveSharingCentre(String userid, SharingCentrePresenter presenter) {
        sharingInputBoundary.retrieveSharingCentre(userid, presenter);
    }
}
