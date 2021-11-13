package InputBoundary;

import OutputBoundary.*;

public interface SharingCentreInputBoundary {
    /**
     * This interface is implemented by PostManager.
     */

    void runPostAPost(String[] parameters, PostAPostOutputBoundary outputBoundary);

    void runDeletePost(String[] parameters, DeletePostOutputBoundary outputBoundary);

    void runCommentPost(String[] parameters, CommentPostOutputBoundary outputBoundary);

    void likeAPost(String[] parameters);

    void retrieveUsersAllPosts(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveSharingCentre(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveNotifications(String parameters, NotificationOutputBoundary outputBoundary);
}
