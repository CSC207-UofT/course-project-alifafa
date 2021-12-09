package Controllers.UserControllers.RemoveAndAddFriend;

import InputBoundary.UserInputBoundary;
import Presenters.User.RemoveFriendPresenter;
import UseCase.UserManager;

public class RemoveFriendController {

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary RemoveFriendInputBoundary = new UserManager();

    /*    public void setAddFriendInputBoundary(UserInputBoundary addFriendInputBoundary) {
    //        AddFriendInputBoundary = addFriendInputBoundary;
    //    }
    */
    public void removeFriend(String[] parameters, RemoveFriendPresenter presenter) {
        RemoveFriendInputBoundary.runRemoveFriend(parameters, presenter);
    }


}
