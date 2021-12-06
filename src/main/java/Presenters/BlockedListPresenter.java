package Presenters;

import OutputBoundary.BlockedListOutputBoundary;

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
