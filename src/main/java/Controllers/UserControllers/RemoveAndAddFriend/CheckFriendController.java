package Controllers.UserControllers.RemoveAndAddFriend;


import InputBoundary.UserInputBoundary;
import Presenters.User.CheckFriendPresenter;
import UseCase.UserManager;

public class CheckFriendController {

    private final UserInputBoundary checkFriendInputBoundary = new UserManager();

    public void checkFriend(String me, String friend, CheckFriendPresenter presenter) {
        checkFriendInputBoundary.runCheckFriend(me, friend, presenter);
    }
}