package main.Controllers.UserControllers;

import main.UseCases.UseCase;
import main.User;
import main.UserManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class AccountRegistrationController extends UserController{

    public AccountRegistrationController(){
        super(new UserManager());
        this.userPrompt.add("ID");
        this.userPrompt.add("Username");
        this.userPrompt.add("Password");
    }


    /**
     * Check if this ID already exists.
     * @param inputID The input from the user, which is a string contains userID.
     * @return return a boolean indicating whether the ID can be used.
     */
    public boolean checkID(String inputID) {
        UserManager manager = (UserManager)this.useCase;
        return manager.checkID(inputID);
    }


    /**
     *
     * @param parameters The input from the user, which is an array containing userID, username and password.
     */
    public void createAnAccount(String[] parameters){
        UserManager userManager = (UserManager)this.useCase;
        User newUser = userManager.createUser(parameters[0], parameters[1], parameters[2]);
    }




}

