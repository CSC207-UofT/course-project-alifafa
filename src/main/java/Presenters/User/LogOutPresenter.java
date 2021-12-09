package Presenters.User;

import OutputBoundary.User.LogIn_LogOut.LogOutOutputBoundary;

/**
 * Store the result after performing log out task.
 */
public class LogOutPresenter implements LogOutOutputBoundary {
    boolean loggedIn;


    /**
     * Return whether the user is logged in.
     * @return log in status.
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }


    /**
     * set the log in status of the user.
     * @param loggedIn log in status.
     */
    @Override
    public void setLogInStatus(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * return a readable message to the user
     * @return a readable message
     */
    @Override
    public String presentOutput() {
        return ("Your are logged out!");

    }
}
