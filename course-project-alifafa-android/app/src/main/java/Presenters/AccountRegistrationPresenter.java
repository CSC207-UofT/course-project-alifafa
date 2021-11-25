package Presenters;

import OutputBoundary.AccountRegistrationOutputBoundary;


public class AccountRegistrationPresenter implements AccountRegistrationOutputBoundary {
    boolean registrationStatus;

    @Override
    public void setRegistrationStatus(boolean success) {
        this.registrationStatus = success;
    }


    @Override
    public String presentOutput() {
        if(! registrationStatus){
            return ("This ID already exists. Please use another one.");
        } else {
            return ("Your account is successfully created!");
        }
    }
}