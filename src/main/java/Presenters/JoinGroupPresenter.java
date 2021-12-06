package Presenters;

import OutputBoundary.JoinGroupOutputBoundary;

public class JoinGroupPresenter implements JoinGroupOutputBoundary {
    private String groupName;
    private String output;
    private String status;

    @Override
    public void setJoinGroupStatus(String status) {
        this.status = status;
    }

    @Override
    public void setJoinGroupName(String groupName) {
        this.groupName = groupName;
        status = "success";
    }

    public void setOutput() {
        switch(status) {
            case "already in group":
                output = "You have already joined in this group.";
                break;
            case "success":
                output = "You have successfully joined " + "'" + this.groupName + "'" + " as one of your group!";
                break;
        }
    }

    @Override
    public String presentOutput() {
        setOutput();
        return output;
    }
}