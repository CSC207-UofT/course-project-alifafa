package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.EditInfoPresenter;
import UseCase.UserManager;

/**
 * This class is responsible for editing username and password.
 */
public class EditInfoController {

    private final UserInputBoundary EditInfoInputBoundary = new UserManager();

    public void editInfo(String[] parameters, EditInfoPresenter presenter){
        EditInfoInputBoundary.runEditInfo(parameters, presenter);
    }
}
