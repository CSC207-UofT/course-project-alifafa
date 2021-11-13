package Controllers.UserControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.CreateGroupPresenter;
import UseCase.GroupManager;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to create an account.
 */
public class CreateGroupController{
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final GroupInputBoundary CreateGroupInputBoundary = new GroupManager();

    /**
     * A new AccountRegistrationController for the use case defined by the AccountRegistrationInputBoundary.
     * @param AccountRegistrationInputBoundary the input boundary for the login use case
     */
//    public AccountRegistrationController(UserInputBoundary AccountRegistrationInputBoundary) {
//        this.AccountRegistrationInputBoundary = AccountRegistrationInputBoundary;
//    }

    /**
     *
     * @param parameters The input from the user, which is an array that contains userID and input password.
     */
    public void createAGroup(String[] parameters, CreateGroupPresenter presenter) {
        CreateGroupInputBoundary.runCreateGroup(parameters, presenter);
    }
}
