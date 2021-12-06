package Presenters;

import OutputBoundary.LogOutOutputBoundary;

public class LogOutPresenter implements LogOutOutputBoundary {
    boolean loggedIn;


    public boolean isLoggedIn() {
        return loggedIn;
    }


    @Override
    public void setLogInStatus(boolean loggedIn) {

    }

    @Override
    public String presentOutput() {
        return ("Your are logged out!");

    }
}
