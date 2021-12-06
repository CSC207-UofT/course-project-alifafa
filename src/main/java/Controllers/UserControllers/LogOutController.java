package Controllers.UserControllers;


import InputBoundary.UserInputBoundary;
import UseCase.UserManager;

public class LogOutController {
    /**
     * The log out controller when the user wants to log out.
     */
    private final UserInputBoundary logOutInputBoundary = new UserManager();

/*    /**
//     * A new logOutController for the use case defined by the LogOutInputBoundary.
//     * @param loginInputBoundary the input boundary for the login use case
//     */
/*    public void setLoginInputBoundary(UserInputBoundary loginInputBoundary) {
//        this.logOutInputBoundary = logOutInputBoundary;
//    }
*/


    /**
     *
     * @param username The input from the user, which is an array that contains userID and input password.
     *
     */

//    public void runLogIn(String[] parameters, LogInPresenter presenter) {
//        loginInputBoundary.runLogIn(parameters, presenter);
//    }
    public void runLogOut(String username){
        logOutInputBoundary.runLogOut(username);
    }

}