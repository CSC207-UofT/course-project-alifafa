package Presenters.User;

import OutputBoundary.Message.PtoG.CheckGroupOutputBoundary;

public class CheckGroupPresenter implements CheckGroupOutputBoundary {
    boolean inGroup;

    @Override
    public void setCheckGroupStatus(boolean inGroup) {
        this.inGroup = inGroup;
    }

    @Override
    public String presentOutput() {
        if (inGroup) {
            return "You are in this group.";
        } else {
            return "You are not in this group, please join this group first.";
        }
    }

    public boolean inGroup() {
        return inGroup;
    }
}
