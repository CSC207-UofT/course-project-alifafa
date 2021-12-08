package Presenters.User;

import OutputBoundary.User.Add_Remove_Block_User.CheckFriendOutputBoundary;

public class CheckFriendPresenter implements CheckFriendOutputBoundary {
    boolean isFriend;

    @Override
    public void setCheckFriendStatus(boolean isFriend) {
        this.isFriend = isFriend;
    }

    @Override
    public String presentOutput() {
        if (isFriend) {
            return "Valid friend.";
        } else {
            return "Invalid friend, please re-enter friend username.";
        }
    }

    public boolean isFriend() {
        return isFriend;
    }
}
