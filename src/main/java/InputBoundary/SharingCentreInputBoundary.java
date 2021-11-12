package InputBoundary;

import OutputBoundary.CommentPostOutputBoundary;
import OutputBoundary.DeletePostOutputBoundary;
import OutputBoundary.PostAPostOutputBoundary;
import OutputBoundary.SharingCentreOutputBoundary;

public interface SharingCentreInputBoundary {
    /**
     * This interface is implemented by PostManager.
     */

    void runPostAPost(String[] parameters, PostAPostOutputBoundary outputBoundary);

    void runDeletePost(String[] parameters, DeletePostOutputBoundary outputBoundary);

    void runCommentPost(String[] parameters, CommentPostOutputBoundary outputBoundary);

    void retrieveUsersAllPosts(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveSharingCentre(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveNotifications(String parameters, SharingCentreOutputBoundary outputBoundary);
}
