package Presenters.User;

import OutputBoundary.User.Add_Remove_Block_User.RemoveFriendOutputBoundary;

/**
 * This class is responsible for storing output after removing a friend.
 */
public class RemoveFriendPresenter implements RemoveFriendOutputBoundary {
    String status;

    /**
     * record the friend name the user want to remove
     *
     * @param friendName the name of the friend
     */
    @Override
    public void setRemoveFriendName(String friendName) {
        this.status = friendName;
    }

    /**
     * return a readable message telling the user that the friend is removed
     *
     * @return a readable message
     */
    @Override
    public String presentOutput() {
        return "You have removed " + this.status + " from your friend!";
    }
}