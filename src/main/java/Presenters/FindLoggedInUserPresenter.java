package Presenters;

import OutputBoundary.LogOutOutputBoundary;

public class FindLoggedInUserPresenter implements LogOutOutputBoundary {
    String userName;

    @Override
    public void getUsername(String userName){
        this.userName = userName;
    }

    @Override
    public String presentOutput() {
        return userName;
    }
}