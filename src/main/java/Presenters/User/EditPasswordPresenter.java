package Presenters.User;

import OutputBoundary.User.Create_Edit_Account.EditPasswordOutputBoundary;

public class EditPasswordPresenter implements EditPasswordOutputBoundary {
    boolean edited;

    public void setEdited(boolean edited){this.edited = edited;}


    public String presentOutput() {
        return "You have edited your password!";
    }
}
