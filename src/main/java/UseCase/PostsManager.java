package UseCase;

import Entity.*;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostsManager {
    /**
     * This use-case can 'post', 'delete', 'comment', and 'like' a
     * post.
     */

    private ParagraphPost createPost(String content, String visibleTo, String location, List<File> pictures){
        if (!pictures.isEmpty()) {
            return new PicturePost(LocalDateTime.now(), visibleTo, location, content, pictures);
        }
        return new ParagraphPost(LocalDateTime.now(), visibleTo, location, content);
    }

    private List<User> sharePostTo(User user, String visibleTo){
        List<User> users = new ArrayList<>();
        if (visibleTo.equals("FRIEND")) {
            return user.getFriends();
        }
        return users;
    }

    public void postAPost(User user, String content, String visibleTo, String location, List<File> pictures){
        ParagraphPost post = createPost(content, visibleTo, location, pictures);
        user.getSharingCentre().getAllPosts().add(post);
        user.getMyPosts().add(post);
        // Add post to this which the user wants to share with
        for (User friend: sharePostTo(user, visibleTo)) {
            friend.getSharingCentre().getAllPosts().add(post);
            friend.getSharingCentre().setNewPostNotification(true);
        }
    }

    public void deletePost(User user, ParagraphPost post){
        user.getSharingCentre().getAllPosts().remove(post);
        user.getMyPosts().remove(post);
        for (User friend : sharePostTo(user, post.getVisibleTo())) {
            friend.getSharingCentre().getAllPosts().remove(post);
        }
    }

    public void likePost(User user, ParagraphPost post){
        post.setLikes(post.getLikes() + 1);
        post.getUsersWhoLiked().add(user);
        Notifications notification = new Notifications(user, LocalDateTime.now(), post, true);
        addNotification(user, post, notification);
    }

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

    public void commentPost(User user, ParagraphPost post, String comment){
        addElementToHashMap(user, post.getComments(), comment);
        Notifications notification = new Notifications(user, LocalDateTime.now(), post, false);
        addNotification(user, post, notification);
    }

}
