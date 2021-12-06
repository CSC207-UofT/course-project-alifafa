package Presenters;

import OutputBoundary.EditInfoOutputBoundary;

public class EditInfoPresenter implements EditInfoOutputBoundary {
    boolean edited;

    public void setEdited(boolean edited){this.edited = edited;}

    public String presentOutput() {
        return "You have edited your info!";
    }
}
