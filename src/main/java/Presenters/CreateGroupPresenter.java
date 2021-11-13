package Presenters;

import OutputBoundary.CreateGroupOutputBoundary;

import java.util.ArrayList;

public class CreateGroupPresenter implements CreateGroupOutputBoundary {
    boolean CreateStatus;

    @Override
    public void SetCreateStatus(boolean success) {
        this.CreateStatus = success;
    }


    @Override
    public String presentOutput() {
        if(! CreateStatus){
            return ("This Group already exists. Please use another one.");
        } else {
            return ("Your group is successfully created!");
        }
    }
}