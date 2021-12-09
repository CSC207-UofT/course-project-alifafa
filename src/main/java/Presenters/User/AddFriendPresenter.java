package Presenters.User;

import OutputBoundary.User.Add_Remove_Block_User.AddFriendOutputBoundary;

/**
 * This class return the result of adding friend.
 */
public class AddFriendPresenter implements AddFriendOutputBoundary {
    private String friendName;
    private String output;
    private String status;

    /**
     * setter method
     *
     * @param friendName name of friend that the user want to add
     */
    @Override
    public void setAddFriendName(String friendName) {
        this.friendName = friendName;
        status = "success";
    }

    /**
     * getter method for friendName
     *
     * @return the name of friend
     */
    public String getFriendName() {
        return friendName;
    }

    /**
     * Getter method for String.
     *
     * @return the status whether successfully added the friend.
     */
    public String getStatus() {
        return status;
    }

    /**
     * setter method for status
     *
     * @param status indicate whether successful added the friend
     */
    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * setter for the output to be sent to user
     */
    public void setOutput() {
        switch (status) {
            case "existing friend":
                output = "You already have this friend! How can you forget about it...";
                break;
            case "success":
                output = "You have added " + this.friendName + " as your friend!";
                break;
            case "add themselves":
                output = "It does not make sense to add yourself as a friend...";
        }
    }

    /**
     * Get the output of the presenter.
     *
     * @return the output
     */
    public String getOutput() {
        return output;
    }

    /**
     * Return the output
     *
     * @return return output to UI
     */
    @Override
    public String presentOutput() {
        setOutput();
        return output;
    }
}
