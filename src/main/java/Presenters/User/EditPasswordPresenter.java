package Presenters.User;

import OutputBoundary.User.Create_Edit_Account.EditPasswordOutputBoundary;

/**
 * The class store the output after editing password.
 */
public class EditPasswordPresenter implements EditPasswordOutputBoundary {
    boolean edited;


    /**
     * Set the status of editing password.
     * @param edited edit status.
     */
    public void setEdited(boolean edited){this.edited = edited;}

    /**
     * Return the string indicating that password has changed
     * @return the string to the user
     */
    public String presentOutput() {
        if(edited) {
            return "You have edited your password!";
        } else{
            return "unsuccessful";
        }
    }
}
