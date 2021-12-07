package Controllers.UserControllers.RemoveAndAddFriend;

import InputBoundary.UserInputBoundary;
import Presenters.AddFriendPresenter;
import UseCase.UserManager;

import java.io.IOException;

public class AddFriendController{

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final UserInputBoundary AddFriendInputBoundary = new UserManager();

/*    public void setAddFriendInputBoundary(UserInputBoundary addFriendInputBoundary) {
//        AddFriendInputBoundary = addFriendInputBoundary;
//    }
*/
    public void addFriend(String[] parameters, AddFriendPresenter presenter) throws IOException {
        AddFriendInputBoundary.runAddFriend(parameters, presenter);
    }


}
