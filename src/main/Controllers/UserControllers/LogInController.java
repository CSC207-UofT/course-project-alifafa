package main.Controllers.UserControllers;

import main.UserManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to log in.
 */
public class LogInController extends UserController{

    public LogInController(){
        super();
        this.userPrompt.add("Username");
        this.userPrompt.add("Password");
    }

    /**
     *
     * @param manager UserManager that is responsible for getting the user's password.
     * @param input The input from the user, which is an array that contains userID and input password.
     * @return return a boolean indicating whether the user can log in.
     */
    public boolean checkMatch(UserManager manager, String[] input){
        String password = manager.logIn(input[0]);
        if (password != null) {
            if (password.equals(input[1])) {
                manager.changeLogInStatus(input[0]);
                return true;
            }
        }
        return false;
    }
}
