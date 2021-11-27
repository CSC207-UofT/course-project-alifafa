package com.example.myapplication.Controllers.UserControllers;

import android.widget.EditText;
import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.UseCase.UserManager;


/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to log in.
 */
public class LogInController{

    /**
     * The input boundary for the login use case.
     */
    private final UserInputBoundary loginInputBoundary = new UserManager();

/*    /**
//     * A new LoginController for the use case defined by the LoginInputBoundary.
//     * @param loginInputBoundary the input boundary for the login use case
//     */
/*    public void setLoginInputBoundary(UserInputBoundary loginInputBoundary) {
//        this.loginInputBoundary = loginInputBoundary;
//    }
*/


    /**
     *
     * @param username The input from the user, which is an array that contains userID and input password.
     *                 param名字有错，请修改
     */

//    public void runLogIn(String[] parameters, LogInPresenter presenter) {
//        loginInputBoundary.runLogIn(parameters, presenter);
//    }
    public boolean runLogIn(EditText username, EditText password){
        return true;
    }

}