package com.example.myapplication.Controllers.PostSharingController;

import com.example.myapplication.InputBoundary.SharingCentreInputBoundary;
import com.example.myapplication.Presenters.SharingCentrePresenter;
import com.example.myapplication.UseCase.PostsManager;

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