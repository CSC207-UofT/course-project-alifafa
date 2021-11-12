package Presenters;

import OutputBoundary.DeletePostOutputBoundary;

public class DeletePostPresenter implements DeletePostOutputBoundary {
    boolean deleted = false;

    @Override
    public void setDeleteStatus(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String presentOutput() {
        if (!deleted) {
            return ("The post you're trying to delete doesn't exist.");
        }
        return ("Deleted post successfully.");
    }

}
