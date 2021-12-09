package Presenters.User;

import OutputBoundary.Message.PtoG.CheckGroupOutputBoundary;

/**
 * This class check if the user is in the group.
 */
public class CheckGroupPresenter implements CheckGroupOutputBoundary {
    boolean inGroup;

    /**
     * setter for inGroup.
     *
     * @param inGroup in group status.
     */
    @Override
    public void setCheckGroupStatus(boolean inGroup) {
        this.inGroup = inGroup;
    }

    /**
     * present the output after checking
     *
     * @return whether the user is in the group
     */
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
