package Presenters.User;

import OutputBoundary.RemoveFriendOutputBoundary;

public class RemoveFriendPresenter implements RemoveFriendOutputBoundary {
    String status;

    @Override
    public void setRemoveFriendName(String friendName) {
        this.status = friendName;
    }

    @Override
    public String presentOutput() {
        return "You have removed "+ this.status + " from your friend!";
    }
}