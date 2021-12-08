package Controllers.UserControllers.RegistrationAndLogIn;

import InputBoundary.UserInputBoundary;
import Presenters.User.EditPasswordPresenter;
import UseCase.UserManager;

/**
 * This class is responsible for editing username and password.
 */
public class EditPasswordController {

    private final UserInputBoundary EditInfoInputBoundary = new UserManager();

    public void editPassword(String[] parameters, EditPasswordPresenter presenter){
        EditInfoInputBoundary.runEditPassword(parameters, presenter);
    }
}
