package OutputBoundary.User.Add_Remove_Block_User;

public interface RemoveFriendOutputBoundary {
    /**
     * @param status the username of the friend to remove.
     */
    void setRemoveFriendName(String status);

    /**
     * @return remove friend message.
     */
    String presentOutput();
}
