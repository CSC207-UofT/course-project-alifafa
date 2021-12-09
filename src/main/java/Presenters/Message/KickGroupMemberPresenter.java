package Presenters.Message;

import OutputBoundary.Message.PtoG.KickGroupMemberOutputBoundary;

public class KickGroupMemberPresenter implements KickGroupMemberOutputBoundary {
    String status;
    String group;

    @Override
    public void setRemoveUsername(String username) {
        this.status = username;
    }

    @Override
    public void setGroupName(String name) {
        this.group = name;
    }

    @Override
    public String presentOutput() {
        return "You have kicked " + this.status + " from " + this.group + "!";
    }
}