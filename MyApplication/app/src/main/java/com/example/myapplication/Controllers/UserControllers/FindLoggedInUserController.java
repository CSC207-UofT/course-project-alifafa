package com.example.myapplication.Controllers.UserControllers;

import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.FindLoggedInUserPresenter;
import com.example.myapplication.UseCase.UserManager;

public class FindLoggedInUserController {
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary findLoggedUserInputBoundary = new UserManager();

    /*    public void setAddFriendInputBoundary(UserInputBoundary addFriendInputBoundary) {
    //        AddFriendInputBoundary = addFriendInputBoundary;
    //    }
    */
    public void findLoggedInUser(FindLoggedInUserPresenter presenter){
        findLoggedUserInputBoundary.findLoggedInUser(presenter);
    }
}
