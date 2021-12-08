package OutputBoundary;

public interface DeletePostOutputBoundary {
    /**
     * @param deleted delete status.
     */
    void setDeleteStatus(boolean deleted);

    /**
     * @return delete post message.
     */
    String presentOutput();
}
