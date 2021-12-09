package Entity.Post;

import Entity.Users.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParagraphPost implements Serializable {
    /**
     * A parent class. A post contains content, location, assigned id, time
     * when it's posted, list of comments, and list of users who like the post,
     */

    private final LocalDateTime POSTTIME;
    private final List<String[]> comments;
    private final List<User> usersWhoLiked;
    private final String userName;
    private final String LOCATION;
    private final String postID;
    private final List<String> pictures;
    private String content;
    private int likes;

    /**
     * Creates a post.
     *
     * @param POSTTIME When the post is posted
     * @param LOCATION The location
     * @param content  The user's post description
     */
    public ParagraphPost(String userName, LocalDateTime POSTTIME, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.LOCATION = LOCATION;
        this.userName = userName;
        this.content = content;
        this.comments = new ArrayList<>();
        this.usersWhoLiked = new ArrayList<>();
        this.postID = UUID.randomUUID().toString();
        likes = 0;
        this.pictures = new ArrayList<>();
    }

    public ParagraphPost(String userName, LocalDateTime POSTTIME, String LOCATION, String content, List<String> pictures) {
        this.POSTTIME = POSTTIME;
        this.LOCATION = LOCATION;
        this.userName = userName;
        this.content = content;
        this.comments = new ArrayList<>();
        this.usersWhoLiked = new ArrayList<>();
        this.postID = UUID.randomUUID().toString();
        likes = 0;
        this.pictures = pictures;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public LocalDateTime getPOSTTIME() {
        return POSTTIME;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String[]> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostID() {
        return postID;
    }

    public List<User> getUsersWhoLiked() {
        return usersWhoLiked;
    }

    public String getUserName() {
        return userName;
    }

    public String toString() {
        StringBuilder allComments = new StringBuilder("\n");
        StringBuilder userLiked = new StringBuilder();
        String picture;
        if (pictures.isEmpty()) {
            picture = "";
        } else {
            picture = "\nPictures: " + pictures;
        }
        for (User user : usersWhoLiked) {
            userLiked.append(user.getUserName()).append("\t");
        }
        for (String[] comment : comments) {
            allComments.append("\t").append(comment[0]).append(": ").append(comment[1]).append("\n");
        }
        return userName + "\t\t" + "PostID: " + postID + "\n" + "Content: " + content + picture + "\n" +
                "Location: " + LOCATION + "\t\t" + "Likes:" + likes + "\n" + "Time posted: " + POSTTIME + "\n" +
                "WhoLiked: " + userLiked + "\n" + "Comments: " + allComments;
    }
}
