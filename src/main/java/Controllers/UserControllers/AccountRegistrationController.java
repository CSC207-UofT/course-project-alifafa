package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.AccountRegistrationPresenter;
import Presenters.LogInPresenter;
import UseCase.UserManager;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class AccountRegistrationController{
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary AccountRegistrationInputBoundary;

    /**
     * A new AccountRegistrationController for the use case defined by the AccountRegistrationInputBoundary.
     * @param AccountRegistrationInputBoundary the input boundary for the login use case
     */
    public AccountRegistrationController(UserInputBoundary AccountRegistrationInputBoundary) {
        this.AccountRegistrationInputBoundary = AccountRegistrationInputBoundary;
    }

    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     */
    public void createAnAccount(String[] parameters, AccountRegistrationPresenter presenter) {
        AccountRegistrationInputBoundary.runAccountRegistration(parameters, presenter);
    }
}

