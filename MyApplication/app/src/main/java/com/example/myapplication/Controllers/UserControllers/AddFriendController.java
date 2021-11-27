package com.example.myapplication.Controllers.UserControllers;

import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.AddFriendPresenter;
import com.example.myapplication.UseCase.UserManager;

public class AddFriendController{

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary AddFriendInputBoundary = new UserManager();

    /*    public void setAddFriendInputBoundary(UserInputBoundary addFriendInputBoundary) {
    //        AddFriendInputBoundary = addFriendInputBoundary;
    //    }
    */
    public void addFriend(String[] parameters, AddFriendPresenter presenter){
        AddFriendInputBoundary.runAddFriend(parameters, presenter);
    }


}