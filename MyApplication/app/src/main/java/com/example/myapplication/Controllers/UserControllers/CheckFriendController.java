package com.example.myapplication.Controllers.UserControllers;

import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.CheckFriendPresenter;
import com.example.myapplication.UseCase.UserManager;

public class CheckFriendController {

    private final UserInputBoundary checkFriendInputBoundary = new UserManager();

    public void runCheckFriend(String me, String friend, CheckFriendPresenter presenter){
        checkFriendInputBoundary.runCheckFriend(me, friend, presenter);
    }
}
