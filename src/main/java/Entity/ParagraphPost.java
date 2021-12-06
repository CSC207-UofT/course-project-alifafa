package Entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParagraphPost implements Serializable {
    /**
     * A parent class. A post contains content, location, assigned id, time
     * when it's posted, list of comments, and list of users who like the post,
     */

    private final LocalDateTime POSTTIME;
    private final List<String[]> comments;
    private final List<User> usersWhoLiked;
    private final String userName;
    private String content;
    private final String LOCATION;
    private int likes;
    protected static int id = 0;
    private final int postID;

    /**
     * Creates a post.
     * @param POSTTIME When the post is posted
     * @param LOCATION The location
     * @param content The user's post description
     */
    public ParagraphPost(String userName, LocalDateTime POSTTIME, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.LOCATION = LOCATION;
        this.userName = userName;
        this.content = content;
        this.comments = new ArrayList<>();
        this.usersWhoLiked = new ArrayList<>();
        this.postID = id;
        likes = 0;
        id += 1;
    }

    public  void setLikes(int likes) {
        this.likes = likes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getPOSTTIME() {
        return POSTTIME;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public  int getLikes() {
        return likes;
    }

    public List<String[]> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public static int getId() {
        return id;
    }

    public int getPostID() {
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
        for (String[] comment : comments) {
            allComments.append("\t").append(comment[0]).append(": ").append(comment[1]).append("\n");
        }
        return userName + "\n" + "Content: " + content + "\n" + "Location: " + LOCATION + "\t\t" + "Likes:"+ likes + "\n" +
                "WhoLiked: " + usersWhoLiked + "\n" + "Comments: " + allComments;
    }

    public static void main(String[] args) {
        ParagraphPost post = new ParagraphPost("Lucas", LocalDateTime.now(), "Toronto", "NIhaoAAAA");
        post.comments.add(new String[]{"lucas", " hahaha"});
        post.comments.add(new String[]{"ssda", "dasdasdw"});
        System.out.println(post);
    }
}
