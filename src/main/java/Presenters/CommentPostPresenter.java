package Presenters;

import OutputBoundary.CommentPostOutputBoundary;

public class CommentPostPresenter implements CommentPostOutputBoundary {
    boolean commented = false;

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
