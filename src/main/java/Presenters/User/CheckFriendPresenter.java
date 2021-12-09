package Presenters.User;

import OutputBoundary.CheckFriendOutputBoundary;

/**
 * This class return the result of checking whether the friend exists or not.
 */
public class CheckFriendPresenter implements CheckFriendOutputBoundary {
    boolean isFriend;

    /**
     * set the result of checking friend
     * @param isFriend friend status.
     */
    @Override
    public void setCheckFriendStatus(boolean isFriend) {
        this.isFriend = isFriend;
    }

    /**
     * return the result of checking friend.
     * @return result
     */
    @Override
    public String presentOutput() {
        if (isFriend) {
            return "Valid friend.";
        } else {
            return "Invalid friend, please re-enter friend username.";
        }
    }

    /**
     * getter method of the whether the user have the friend
     * @return a boolean
     */
    public boolean isFriend() {
        return isFriend;
    }
}
