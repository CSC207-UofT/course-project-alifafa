package Presenters;

import OutputBoundary.AccountRegistrationOutputBoundary;

public class AccountRegistrationPresenter implements AccountRegistrationOutputBoundary {
    boolean registrationStatus;
    String message;


    @Override
    public void setRegistrationStatus(boolean success) {
        this.registrationStatus = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getRegistrationStatus() {
        return registrationStatus;
    }

    @Override
    public String presentOutput() {
        // TODO: I can implement a observer design pattern here (related to user manager).
        if (message!=null){
            return message;
        }
        if(! registrationStatus){
            message = "This username already exists. Please use another one.";
        } else {
            message = ("Your account is successfully created!");
        }
        return message;
    }
}