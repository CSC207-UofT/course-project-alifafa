package Presenters.User;

import OutputBoundary.BlockedListOutputBoundary;

/**
 * This class return the output after adding user to the blocklist.
 */
public class BlockedListPresenter implements BlockedListOutputBoundary {

    private String friend;

    @Override
    public void setAddBlockedStatus(String status) {
        this.friend = status;
    }

    @Override
    public String presentOutput() {
        return "You have added "+ this.friend + " into your blocked list!";
    }
}
