package Controllers.PostsSharingController;

import InputBoundary.SharingCentreInputBoundary;
import Presenters.*;
import UseCase.PostsManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PostAPostController {

    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    /**
     * Ask the use case to run PostAPost method.
     * @param userid The id of the user who wants post something
     * @param content The content of the post
     * @param location The location (optional*)
     * @param pictures Include pictures (optional*)
     * @param presenter PostAPostPresenter
     */
    public void runPostAPost(String userid, String content, String location, List<String> pictures,
                              PostAPostPresenter presenter){

        sharingInputBoundary.runPostAPost(userid, content, location, pictures, presenter);
    }
}
