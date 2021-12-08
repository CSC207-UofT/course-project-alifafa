package OutputBoundary;

public interface PostAPostOutputBoundary {
    /**
     * @param posted posting status of a post.
     */
    void setPostStatus(boolean posted);

    /**
     * @return post a post message.
     */
    String presentOutput();
}
