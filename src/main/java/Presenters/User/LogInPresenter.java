package Presenters.User;

import OutputBoundary.LogInOutputBoundary;

/**
 * This class store the result after performing log in task.
 */
public class LogInPresenter implements LogInOutputBoundary {
    boolean loggedIn;

    /**
     * set the log in status
     * @param loggedIn log in status
     */
    @Override
    public void setLogInStatus(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * get the log in status.
     * @return return true if the user is logged in.
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * Return the readable message to user.
     * @return the message.
     */
    @Override
    public String presentOutput() {
        if(! loggedIn){
            return ("It does not seem correct. Please re-enter your information");
        } else {
            return ("Your are logged in!");
        }
    }
}

