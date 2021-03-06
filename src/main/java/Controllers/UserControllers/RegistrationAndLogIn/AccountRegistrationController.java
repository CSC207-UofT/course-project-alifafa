package Controllers.UserControllers.RegistrationAndLogIn;

import InputBoundary.UserInputBoundary;
import Presenters.User.AccountRegistrationPresenter;
import UseCase.UserManager;

import java.io.IOException;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class AccountRegistrationController {

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary accountRegistrationInputBoundary = new UserManager();

    /**
     * @param parameters The input from the user, which is an array that contains userName and input passwords.
     * @param presenter  An AccountRegistration Presenter that will store the output from the use case
     * @throws IOException The exception
     */
    public void createAnAccount(String[] parameters, AccountRegistrationPresenter presenter) throws IOException {

        // check if the two passwords match each other
        if (!parameters[1].equals(parameters[2])) {
            presenter.setMessage("The passwords must match!");
        } else {
            String[] validInput = {parameters[0], parameters[1]};
            accountRegistrationInputBoundary.runAccountRegistration(validInput, presenter);
        }
    }
}