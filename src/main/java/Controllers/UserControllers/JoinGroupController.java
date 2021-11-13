package Controllers.UserControllers;

import InputBoundary.GroupInputBoundary;
import InputBoundary.UserInputBoundary;
import Presenters.AccountRegistrationPresenter;
import Presenters.AddFriendPresenter;
import Presenters.JoinGroupPresenter;
import UseCase.GroupManager;
import UseCase.UserManager;

public class JoinGroupController{

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final GroupInputBoundary JoinGroupInputBoundary = new GroupManager();

    /**
     * A new AccountRegistrationController for the use case defined by the InputBoundary.
     */


    // public AddFriendController(UserInputBoundary InputBoundary) {
    // this.AddFriendInputBoundary = InputBoundary;
    // }



    public void joinGroup(String[] parameters, JoinGroupPresenter presenter){
        JoinGroupInputBoundary.runJoinGroup(parameters, presenter);
    }


}
