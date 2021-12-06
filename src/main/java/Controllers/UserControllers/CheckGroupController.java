package Controllers.UserControllers;


import InputBoundary.GroupInputBoundary;
import InputBoundary.UserInputBoundary;
import UseCase.GroupManager;
import UseCase.UserManager;

public class CheckGroupController {

    private final GroupInputBoundary checkGroupInputBoundary = new GroupManager();

    public void checkFriend(String me, String friend, Presenters.CheckFriendPresenter presenter){
        checkGroupInputBoundary.runCheckFriend(me, friend, presenter);
    }
}
