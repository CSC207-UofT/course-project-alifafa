package com.example.myapplication.OutputBoundary;

public interface AccountRegistrationOutputBoundary {
    void setRegistrationStatus(boolean success);
    String presentOutput();
}