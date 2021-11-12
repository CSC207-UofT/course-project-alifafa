package InputBoundary;

import OutputBoundary.SharingCentreOutputBoundary;

public interface SharingCentreInputBoundary {
    /**
     * This interface is implemented by PostManager.
     * sda
     */

    void runPostAPost(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void runDeletePost(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void runLikePost(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void runCommentPost(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveUsersAllPosts(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveSharingCentre(String[] parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveNotifications(String[] parameters, SharingCentreOutputBoundary outputBoundary);
}
