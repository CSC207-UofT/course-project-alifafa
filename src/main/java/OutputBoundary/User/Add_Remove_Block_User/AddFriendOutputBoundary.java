package OutputBoundary.User.Add_Remove_Block_User;

public interface AddFriendOutputBoundary {
    /**
     * @param status add friend status.
     */
    void setAddFriendName(String status);

    /**
     * @return add friend message.
     */
    String presentOutput();

    /**
     * @param s desired add friend status.
     */
    void setStatus(String s);
}
