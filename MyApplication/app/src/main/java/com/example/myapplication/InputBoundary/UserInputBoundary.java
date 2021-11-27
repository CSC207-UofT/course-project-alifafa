package com.example.myapplication.InputBoundary;

import com.example.myapplication.Entity.User;
import com.example.myapplication.OutputBoundary.AccountRegistrationOutputBoundary;
import com.example.myapplication.OutputBoundary.AddFriendOutputBoundary;
import com.example.myapplication.OutputBoundary.LogInOutputBoundary;


public interface UserInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager, but it can use InputBoundary instead.
     */

    void runLogIn (String[] parameters, LogInOutputBoundary outputBoundary);

    void runAccountRegistration (String[] parameters, AccountRegistrationOutputBoundary outputBoundary);

    void runAddFriend(String[] parameters, AddFriendOutputBoundary outputBoundary);

    User getUser (String id);
}