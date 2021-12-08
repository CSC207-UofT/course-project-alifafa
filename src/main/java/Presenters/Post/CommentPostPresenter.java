package Presenters.Post;

import OutputBoundary.Post.CommentPostOutputBoundary;

public class CommentPostPresenter implements CommentPostOutputBoundary {
    boolean commented = false;  // This signifies whether a user commented or
                                // not

    @Override
    public void setCommented(boolean commented) {
        this.commented = commented;
    }

    @Override
    public String presentOutput() {
        if (!commented) {
            return ("The post you are commenting cannot be found.");
        }
        return ("Commented successfully.");
    }
}
