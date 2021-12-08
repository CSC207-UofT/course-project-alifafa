package OutputBoundary.Message.PtoG;

public interface KickGroupMemberOutputBoundary {
    /**
     * @param name group chat name.
     */
    void setGroupName (String name);

    /**
     * @param status remove status.
     */
    void setRemoveUsername(String status);

    /**
     * @return remove group chat member status.
     */
    String presentOutput();
}
