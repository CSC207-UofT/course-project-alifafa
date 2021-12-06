package com.example.myapplication.Presenters;


import com.example.myapplication.OutputBoundary.CreateGroupOutputBoundary;


public class CreateGroupPresenter implements CreateGroupOutputBoundary {
    boolean CreateStatus;

    @Override
    public void SetCreateStatus(boolean success) {
        this.CreateStatus = success;
    }

    public boolean getCreateStatus() {
        return CreateStatus;
    }

    @Override
    public String presentOutput() {
        if(! CreateStatus){
            return ("This Group already exists. Please try another one.");
        } else {
            return ("Your group is successfully created!");
        }
    }
}