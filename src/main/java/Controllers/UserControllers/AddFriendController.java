package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.AccountRegistrationPresenter;
import Presenters.AddFriendPresenter;
import UseCase.UserManager;

public class AddFriendController{

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary AddFriendInputBoundary;

    /**
     * A new AccountRegistrationController for the use case defined by the InputBoundary.
     */
    public AddFriendController(UserInputBoundary InputBoundary) {
        this.AddFriendInputBoundary = InputBoundary;
    }



    public void addFriend(String[] parameters, AddFriendPresenter presenter){
        AddFriendInputBoundary.runAddFriend(parameters, presenter);
    }


}
