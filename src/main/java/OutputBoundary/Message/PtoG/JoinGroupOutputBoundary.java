package OutputBoundary.Message.PtoG;

public interface JoinGroupOutputBoundary {
    void setJoinGroupStatus(String status);

    /**
     * @param status join status.
     */
    void setJoinGroupName(String status);

    /**
     * @return join group chat message.
     */
    String presentOutput();
}