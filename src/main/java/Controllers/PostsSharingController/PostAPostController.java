package Controllers.PostsSharingController;

import InputBoundary.SharingCentreInputBoundary;
import Presenters.DeletePostPresenter;
import Presenters.PostAPostPresenter;
import UseCase.PostsManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PostAPostController {
    // TODO: Add a data access interface attribute
    private final SharingCentreInputBoundary sharingInputBoundary = new PostsManager();

    public void runPostAPost(String userid, String content, String location, List<String> pictures,
                              PostAPostPresenter presenter){
        List<File> files = new ArrayList<>();
        if (!pictures.isEmpty()) {   // Convert input String to File
            int i = 0;
            // Cannot have more than 9 files
            while (i < pictures.size()) {
                files.add(new File(pictures.get(i)));
                i++;
            }
        }
        sharingInputBoundary.runPostAPost(userid, content, location, files, presenter);
    }

    public void runDeletePost(String userid, String postID, DeletePostPresenter presenter) {
        sharingInputBoundary.runDeletePost(userid, postID, presenter);
    }
}
