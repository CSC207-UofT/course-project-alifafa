package Controllers.UserControllers.RegistrationAndLogIn;

import InputBoundary.UserInputBoundary;
import Presenters.User.LogInPresenter;
import UseCase.UserManager;


/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to log in.
 */
public class LogInController {

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
     * @param parameters The input from the user, which is an array that contains userID and input password.
     * @param presenter  logInPresenter that will return the output indicating log in result
     */
    public void runLogIn(String[] parameters, LogInPresenter presenter) {
        loginInputBoundary.runLogIn(parameters, presenter);
    }

}
