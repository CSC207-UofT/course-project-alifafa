package Presenters;

import OutputBoundary.AddFriendOutputBoundary;

public class AddFriendPresenter implements AddFriendOutputBoundary {
    private String friendName;
    private String output;
    private String status;


    @Override
    public void setAddFriendName(String friendName) {
        this.friendName = friendName;
        status = "success";
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public void setOutput() {
        switch(status) {
            case "existing friend":
                output = "You already have this friend! How can you forget about it...";
                break;
            case "success":
                output = "You have added "+ this.friendName + " as your friend!";
                break;
            case "add themselves":
                output = "It does not make sense to add yourself as a friend...";
        }
    }

    @Override
    public String presentOutput() {
        setOutput();
        return output;
    }
}
