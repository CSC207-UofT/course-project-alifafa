package UseCase;

import Entity.*;
import InputBoundary.SharingCentreInputBoundary;
import OutputBoundary.*;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This use-case can 'post', 'delete', 'comment', and 'like' a
 * post.
 */
public class PostsManager implements SharingCentreInputBoundary {

    /**
     * Creates a post.
     * @param content Content of the post (could be none only if pictures is non-empty)
     * @param location Location
     * @param pictures List of pictures that the user wants to add
     *                (could be none)
     * @return Either a PicturePost or a ParagraphPost
     */
    private ParagraphPost createPost(String content, String location, List<File> pictures){
        if (!pictures.isEmpty()) {
            return new PicturePost(LocalDateTime.now(), location, content, pictures);
        }
        return new ParagraphPost(LocalDateTime.now(), location, content);
    }

    /**
     * Posting a post. (But cannot be meaningless where it has no content and
     *                  no pictures)
     * Also notify all user's friends.
     * @param user The user who wants to post
     * @param content Content of the post (could be none only if pictures is non-empty)
     * @param location Location
     * @param pictures List of pictures that the user wants to add
     *                 (could be none)
     */
    public void postAPost(User user, String content, String location, List<File> pictures){
        ParagraphPost post = createPost(content, location, pictures);
        user.getSharingCentre().getAllPosts().add(post);
        user.getMyPosts().add(post);
        // Add post to which the user wants to share with
        for (User friend: user.getFriends()) {
            friend.getSharingCentre().getAllPosts().add(post);
            friend.getSharingCentre().setNewPostNotification(true);
        }
    }

    /**
     * Deleting a specific post from user's collection of posts and removes
     * the post from the sharing centre of the user and the user's friends.
     * @param user The user who wants to delete a post his/her posts.
     * @param post The specific post the user wants to delete.
     */
    public void deletePost(User user, ParagraphPost post){
        user.getSharingCentre().getAllPosts().remove(post);
        user.getMyPosts().remove(post);
        for (User friend : user.getFriends()) {
            friend.getSharingCentre().getAllPosts().remove(post);
        }
    }

    /**
     * Like a post and increase total likes by 1. Add notification to the post
     * creator.
     * @param user The user who liked the post
     * @param post The post liked
     */
    public void likePost(User user, ParagraphPost post){
        post.setLikes(post.getLikes() + 1);
        post.getUsersWhoLiked().add(user);
        Notifications notification = new Notifications(user, LocalDateTime.now(), post, true);
        addNotification(user, post, notification);
    }

    /**
     * Adds notification to the post creator, which is a user.
     * @param user Add notification to either this user or a user's friend
     * @param post If the user's all posts contain this post, then we add the
     *             notification to the post creator
     * @param notification A notification to be added
     */
    private void addNotification(User user, ParagraphPost post, Notifications notification) {
        if (user.getMyPosts().contains(post)){
            user.getSharingCentre().getNotificationList().add(notification);
        } else {
            for (User friend: user.getFriends()){
                if (friend.getMyPosts().contains(post)){
                    friend.getSharingCentre().getNotificationList().add(notification);
                    break;
                }
            }
        }
    }

    private void addElementToHashMap(User key, HashMap<User, List<String>> obj, String element){
        if (obj.containsKey(key)){
            obj.get(key).add(element);
        } else {
            List<String> comments = new ArrayList<>();
            comments.add(element);
            obj.put(key, comments);
        }

    }

    /**
     * Add a comment from the user who commented to the post and add
     * notification to the post creator.
     * @param user Who commented
     * @param post The post that's commented on
     * @param comment Comment the commenter wrote to the post
     */
    public void commentPost(User user, ParagraphPost post, String comment){
        addElementToHashMap(user, post.getComments(), comment);
        Notifications notification = new Notifications(user, LocalDateTime.now(), post, false);
        addNotification(user, post, notification);
    }

    /**
     * Returns all user's posts that he/she currently possess.
     * @param user The user who to retrieve posts from
     * @return All the post user has created (excluding deleted posts)
     */
    public List<ParagraphPost> getUsersAllPosts(User user) {
        return user.getMyPosts();
    }

    /**
     * Returns all user's posts inside his/her sharing centre.
     * @param user The user who to retrieve posts from
     * @return All the post from a particular user's sharing centre
     */
    public List<ParagraphPost> getSharingCentre(User user) {
        return user.getSharingCentre().getAllPosts();
    }

    /**
     * Returns all user's notifications in his/her sharing centre.
     * @param user The user who to retrieve notifications from
     * @return All notifications from this user's sharing centre
     */
    public List<Notifications> getNotifications(User user) {
        return user.getSharingCentre().getNotificationList();
    }

    @Override
    public void runPostAPost(String userid, String content, String location, List<File> pictures, PostAPostOutputBoundary outputBoundary) {
        if (content.isEmpty() && pictures.size() == 0) {
            outputBoundary.setPostStatus(false);
        }
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userid);
        postAPost(user, content, location, pictures);
        outputBoundary.setPostStatus(true);
    }

    @Override
    public void runDeletePost(String userid, String postID, DeletePostOutputBoundary outputBoundary) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userid);
        for (ParagraphPost post: getUsersAllPosts(user)) {
            if (post.getPostid() == Integer.parseInt(postID)) {
                outputBoundary.setDeleteStatus(true);
                deletePost(user, post);
            }
        }
    }

    @Override
    public void runCommentPost(String userid, String postID, String content, CommentPostOutputBoundary outputBoundary) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userid);
        for (ParagraphPost post: getSharingCentre(user)) {
            if (post.getPostid() == Integer.parseInt(postID)) {
                outputBoundary.setCommented(true);
                commentPost(user, post, content);
            }
        }
    }

    @Override
    public void likeAPost(String userid, String postID) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userid);
        for (ParagraphPost post: getSharingCentre(user)) {
            if (post.getPostid() == Integer.parseInt(postID)) {
                likePost(user, post);
            }
        }
    }

    @Override
    public void retrieveUsersAllPosts(String userID, SharingCentreOutputBoundary outputBoundary) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userID);
        outputBoundary.setContent(getUsersAllPosts(user));
    }

    @Override
    public void retrieveSharingCentre(String userID, SharingCentreOutputBoundary outputBoundary) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userID);
        outputBoundary.setContent(getSharingCentre(user));
    }

    @Override
    public void retrieveNotifications(String userID, NotificationOutputBoundary outputBoundary) {
        UserManager userManager = new UserManager();
        User user = userManager.getUser(userID);
        outputBoundary.setContent(getNotifications(user));
    }
}
