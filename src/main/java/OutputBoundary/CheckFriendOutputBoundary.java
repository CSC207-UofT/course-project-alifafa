package OutputBoundary;

public interface CheckFriendOutputBoundary {
    /**
     * @param isFriend friend status.
     */
    void setCheckFriendStatus(boolean isFriend);

    /**
     * @return check friend message.
     */
    String presentOutput();
}
