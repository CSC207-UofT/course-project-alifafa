package Presenters.User;

import OutputBoundary.User.LogIn_LogOut.LogInOutputBoundary;


public class LogInPresenter implements LogInOutputBoundary {
    boolean loggedIn;

    @Override
    public void setLogInStatus(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    @Override
    public String presentOutput() {
        if(! loggedIn){
            return ("It does not seem correct. Please re-enter your information");
        } else {
            return ("Your are logged in!");
        }
    }
}

