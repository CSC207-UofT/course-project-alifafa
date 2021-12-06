package Controllers.UserControllers;


import InputBoundary.UserInputBoundary;
import Presenters.FindLoggedInUserPresenter;
import UseCase.UserManager;

public class FindLoggedInUserController {
    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary findLoggedUserInputBoundary = new UserManager();

    /*    public void setAddFriendInputBoundary(UserInputBoundary addFriendInputBoundary) {
    //        AddFriendInputBoundary = addFriendInputBoundary;
    //    }
    */
    public void findLoggedInUser(FindLoggedInUserPresenter presenter){
        findLoggedUserInputBoundary.findLoggedInUser(presenter);
    }
}