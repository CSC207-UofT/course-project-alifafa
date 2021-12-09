package Controllers.UserControllers.RegistrationAndLogIn;

import InputBoundary.UserInputBoundary;
import Presenters.User.EditPasswordPresenter;
import UseCase.UserManager;

/**
 * This class is responsible for editing username and password.
 */
public class EditPasswordController {

    private final UserInputBoundary EditInfoInputBoundary = new UserManager();

    /**
     * Change the password of an existing and logged in user
     *
     * @param parameters the new password and user's username
     * @param presenter  the presenter will return the output from usecase.
     */
    public void editPassword(String[] parameters, EditPasswordPresenter presenter) {
        EditInfoInputBoundary.runEditPassword(parameters, presenter);
    }
}
