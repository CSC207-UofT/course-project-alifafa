package InputBoundary;

import OutputBoundary.Post.*;

import java.io.IOException;
import java.util.List;

public interface SharingCentreInputBoundary {

    // This interface is implemented by PostManager.

    /**
     * @param user           the user of post
     * @param content        the content of post
     * @param location       the location of post
     * @param pictures       the picture of post
     * @param outputBoundary the outputBoundary of post
     * @throws IOException exception
     */
    void runPostAPost(String user, String content, String location, List<String> pictures, PostAPostOutputBoundary outputBoundary) throws IOException;

    /**
     * @param user           the user of post
     * @param postID         the id of post
     * @param outputBoundary the outputBoundary of post
     */
    void runDeletePost(String user, String postID, DeletePostOutputBoundary outputBoundary);

    /**
     * @param userid         the userid of comment
     * @param postID         the postId of comment
     * @param content        the content of comment
     * @param outputBoundary the outputBoundary of post
     * @throws IOException exception
     */
    void runCommentPost(String userid, String postID, String content, CommentPostOutputBoundary outputBoundary) throws IOException;

    /**
     * @param userid the userid
     * @param postID the post id
     * @throws IOException exception
     */
    void likeAPost(String userid, String postID) throws IOException;

    /**
     * @param parameters     the inputs of retrieveUsersAllPosts
     * @param outputBoundary the outputBoundary of post
     */
    void retrieveUsersAllPosts(String parameters, SharingCentreOutputBoundary outputBoundary);

    /**
     * @param parameters     the input of retrieveSharingCentre
     * @param outputBoundary the outputBoundary of post
     */
    void retrieveSharingCentre(String parameters, SharingCentreOutputBoundary outputBoundary);

    /**
     * @param parameters     the input of retrieveNotifications
     * @param outputBoundary the outputBoundary of post
     */
    void retrieveNotifications(String parameters, NotificationOutputBoundary outputBoundary);
}
