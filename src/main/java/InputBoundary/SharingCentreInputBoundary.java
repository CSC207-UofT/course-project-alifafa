package InputBoundary;

import Entity.User;
import OutputBoundary.*;

import java.io.File;
import java.util.List;

public interface SharingCentreInputBoundary {
    /**
     * This interface is implemented by PostManager.
     */

    void runPostAPost(String user, String content, String location, List<File> pictures, PostAPostOutputBoundary outputBoundary);

    void runDeletePost(String user, String postID, DeletePostOutputBoundary outputBoundary);

    void runCommentPost(String[] parameters, CommentPostOutputBoundary outputBoundary);

    void likeAPost(String[] parameters);

    void retrieveUsersAllPosts(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveSharingCentre(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveNotifications(String parameters, NotificationOutputBoundary outputBoundary);
}
