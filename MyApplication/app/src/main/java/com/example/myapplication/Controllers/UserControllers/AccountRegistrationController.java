package com.example.myapplication.Controllers.UserControllers;


import com.example.myapplication.InputBoundary.UserInputBoundary;
import com.example.myapplication.Presenters.AccountRegistrationPresenter;
import com.example.myapplication.UseCase.UserManager;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class AccountRegistrationController{
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary accountRegistrationInputBoundary = new UserManager();

/*    public void setAccountRegistrationInputBoundary(UserInputBoundary accountRegistrationInputBoundary){
//        this.accountRegistrationInputBoundary = accountRegistrationInputBoundary;
//    }
*/
    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     */
    public void createAnAccount(String[] parameters, AccountRegistrationPresenter presenter) {

        // check if the two passwords match each other
        if (! parameters[1].equals(parameters[2])){
            presenter.setMessage("The passwords must match!");
        } else {
            String[] validInput = {parameters[0], parameters[1]};
            accountRegistrationInputBoundary.runAccountRegistration(validInput, presenter);
        }
    }
}