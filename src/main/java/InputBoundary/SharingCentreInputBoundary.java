package InputBoundary;

import OutputBoundary.*;

import java.io.IOException;
import java.util.List;

public interface SharingCentreInputBoundary {
    /**
     * This interface is implemented by PostManager.
     */

    void runPostAPost(String user, String content, String location, List<String> pictures, PostAPostOutputBoundary outputBoundary) throws IOException;

    void runDeletePost(String user, String postID, DeletePostOutputBoundary outputBoundary);

    void runCommentPost(String userid, String postID, String content, CommentPostOutputBoundary outputBoundary) throws IOException;

    void likeAPost(String userid, String postID) throws IOException;

    void retrieveUsersAllPosts(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveSharingCentre(String parameters, SharingCentreOutputBoundary outputBoundary);

    void retrieveNotifications(String parameters, NotificationOutputBoundary outputBoundary);
}
