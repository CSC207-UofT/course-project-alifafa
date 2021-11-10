package Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParagraphPost {
    private final LocalDateTime POSTTIME;
    private final HashMap<User, List<String>> comments;
    private final List<User> usersWhoLiked;
    private String content;
    private final String LOCATION;
    private int likes;
    protected static int id = 0;
    private final int postid;

    public ParagraphPost(LocalDateTime POSTTIME, String LOCATION, String content) {
        this.POSTTIME = POSTTIME;
        this.LOCATION = LOCATION;
        this.content = content;
        this.comments = new HashMap<>();
        this.usersWhoLiked = new ArrayList<>();
        this.postid = id;
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

    public HashMap<User, List<String>> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public static int getId() {
        return id;
    }

    public int getPostid() {
        return postid;
    }

    public List<User> getUsersWhoLiked() {
        return usersWhoLiked;
    }

}
