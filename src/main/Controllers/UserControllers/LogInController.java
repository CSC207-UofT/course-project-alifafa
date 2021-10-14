package main.Controllers.UserControllers;

import main.UseCases.UseCase;
import main.UserManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to log in.
 */
public class LogInController extends UserController{

    public LogInController(UserManager userManager){
        super(userManager);
        this.userPrompt.add("Username");
        this.userPrompt.add("Password");
    }

    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     * @return return a boolean indicating whether the user can log in.
     */
    public boolean checkMatch(String[] parameters) {
        UserManager manager = (UserManager)this.useCase;
        String password = manager.findPassword(parameters[0]);
        if (password != null) {
            if (password.equals(parameters[1])) {
                manager.changeLogInStatus(parameters[0]);
                return true;
            }
        }
        return false;
    }

}
