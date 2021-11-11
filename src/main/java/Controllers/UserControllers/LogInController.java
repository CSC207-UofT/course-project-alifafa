package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.LogInPresenter;


/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to log in.
 */
public class LogInController{

    /**
     * The input boundary for the login use case.
     */
    private final UserInputBoundary loginInputBoundary;

    /**
     * A new LoginController for the use case defined by the LoginInputBoundary.
     * @param loginInputBoundary the input boundary for the login use case
     */
    public LogInController(UserInputBoundary loginInputBoundary) {
        this.loginInputBoundary = loginInputBoundary;
    }

    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     */
    public void runLogIn(String[] parameters, LogInPresenter presenter) {
        loginInputBoundary.runLogIn(parameters, presenter);
    }

}
