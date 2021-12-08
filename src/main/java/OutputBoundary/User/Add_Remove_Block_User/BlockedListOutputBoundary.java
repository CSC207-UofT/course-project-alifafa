package OutputBoundary.User.Add_Remove_Block_User;

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
