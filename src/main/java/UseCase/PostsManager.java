package UseCase;

import Entity.ParagraphPost;
import Entity.PicturePost;
import Entity.User;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

public class PostsManager {
    /**
     * This use-case can 'post', 'delete', 'edit', 'comment', 'like', and 'favorite' a
     * post.
     */

    private ParagraphPost createPost(String content, String visibleTo, String location, List<File> pictures){
        if (!pictures.isEmpty()) {
            return new PicturePost(LocalDateTime.now(), visibleTo, location, content, pictures);
        }
        return new ParagraphPost(LocalDateTime.now(), visibleTo, location, content);
    }

    public void postAPost(User user, String content, String visibleTo, String location, List<File> pictures){
        ParagraphPost post = createPost(content, visibleTo, location, pictures);
        user.
    }
}
