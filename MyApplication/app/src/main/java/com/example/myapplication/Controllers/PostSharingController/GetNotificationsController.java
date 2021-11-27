package com.example.myapplication.Controllers.PostSharingController;

import com.example.myapplication.InputBoundary.SharingCentreInputBoundary;
import com.example.myapplication.Presenters.NotificationPresenter;
import com.example.myapplication.UseCase.PostsManager;

public class GetNotificationsController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Pass user's id to the use case and have the presenter to return all
     * notifications from user's sharing centre.
     * @param userid The id of the user
     * @param presenter The NotificationPresenter
     */
    public void runRetrieveNotifications(String userid, NotificationPresenter presenter) {
        sharingInputBoundary.retrieveNotifications(userid, presenter);
    }
}