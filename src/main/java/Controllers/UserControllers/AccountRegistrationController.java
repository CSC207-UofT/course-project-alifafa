package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.AccountRegistrationPresenter;
import UseCase.UserManager;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class AccountRegistrationController{
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private UserInputBoundary accountRegistrationInputBoundary = new UserManager();

    public void setAccountRegistrationInputBoundary(UserInputBoundary accountRegistrationInputBoundary){
        this.accountRegistrationInputBoundary = accountRegistrationInputBoundary;
    }

    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     */
    public void createAnAccount(String[] parameters, AccountRegistrationPresenter presenter) {
        accountRegistrationInputBoundary.runAccountRegistration(parameters, presenter);
    }
}

