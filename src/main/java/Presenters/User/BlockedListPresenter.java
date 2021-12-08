package Presenters.User;

import OutputBoundary.User.Add_Remove_Block_User.BlockedListOutputBoundary;

public class BlockedListPresenter implements BlockedListOutputBoundary {

    String status;

    @Override
    public void setAddBlockedStatus(String status) {
        this.status = status;
    }

    @Override
    public String presentOutput() {
        return "You have added "+ this.status + " into your blocked list!";
    }
}
