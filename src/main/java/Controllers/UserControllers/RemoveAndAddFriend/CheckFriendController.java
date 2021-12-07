package Controllers.UserControllers.RemoveAndAddFriend;


import InputBoundary.UserInputBoundary;
import UseCase.UserManager;

public class CheckFriendController {

    private final UserInputBoundary checkFriendInputBoundary = new UserManager();

    public void checkFriend(String me, String friend, Presenters.CheckFriendPresenter presenter){
        checkFriendInputBoundary.runCheckFriend(me, friend, presenter);
    }
}