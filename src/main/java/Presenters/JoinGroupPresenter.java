package Presenters;

import OutputBoundary.JoinGroupOutputBoundary;

public class JoinGroupPresenter implements JoinGroupOutputBoundary {
    String status;

    @Override
    public void setJoinGroupStatus(String status) {
        this.status = status;
    }

    @Override
    public String presentOutput() {
        return "You have successfully joined "+ "'" + this.status + "'" + " group!";
    }
}