package OutputBoundary;

public interface BlockedListOutputBoundary {
    /**
     * @param status block status.
     */
    void setAddBlockedStatus(String status);

    /**
     * @return block user message.
     */
    String presentOutput();
}
