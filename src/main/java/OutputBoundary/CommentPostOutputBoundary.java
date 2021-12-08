package OutputBoundary;

public interface CommentPostOutputBoundary {
    /**
     * @param commented comment status.
     */
    void setCommented(boolean commented);

    /**
     * @return comment post message.
     */
    String presentOutput();
}
