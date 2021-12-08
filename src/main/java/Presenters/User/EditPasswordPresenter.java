package Presenters.User;

import OutputBoundary.EditPasswordOutputBoundary;

public class EditPasswordPresenter implements EditPasswordOutputBoundary {
    boolean edited;

    public void setEdited(boolean edited){this.edited = edited;}


    public String presentOutput() {
        return "You have edited your password!";
    }
}
