package Presenters.User;

import OutputBoundary.User.LogIn_LogOut.LogOutOutputBoundary;

public class LogOutPresenter implements LogOutOutputBoundary {
    boolean loggedIn;


    public boolean isLoggedIn() {
        return loggedIn;
    }


    @Override
    public void setLogInStatus(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public String presentOutput() {
        return ("Your are logged out!");

    }
}
