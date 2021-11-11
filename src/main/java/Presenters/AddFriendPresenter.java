package Presenters;

import OutputBoundary.AddFriendOutputBoundary;

public class AddFriendPresenter implements AddFriendOutputBoundary {
    String status;

    @Override
    public void setAddFriendStatus(String status) {
        this.status = status;
    }

    @Override
    public String presentOutput() {
        return "You have added "+ this.status + " as your friend!";
    }
}
