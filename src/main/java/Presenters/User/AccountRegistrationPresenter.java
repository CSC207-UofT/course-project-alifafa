package Presenters.User;

import OutputBoundary.User.Create_Edit_Account.AccountRegistrationOutputBoundary;

/**
 * This class is storing the output from UserManager and presenting it to the UI.
 */
public class AccountRegistrationPresenter implements AccountRegistrationOutputBoundary {
    boolean registrationStatus;
    String message;

    /**
     * Setter for the message we want to present.
     *
     * @param message the message we want to show to the user.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for registration status.
     *
     * @return return a boolean for registration status.
     */
    public boolean getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Setter for registration status.
     *
     * @param success registration status.
     */
    @Override
    public void setRegistrationStatus(boolean success) {
        this.registrationStatus = success;
    }

    /**
     * Present the message to the UI.
     *
     * @return the message we want to show to the user.
     */
    @Override
    public String presentOutput() {
        // TODO: I can implement a observer design pattern here (related to user manager).
        if (message != null) {
            return message;
        }
        if (!registrationStatus) {
            message = "This username already exists. Please use another one.";
        } else {
            message = ("Your account is successfully created!");
        }
        return message;
    }
}