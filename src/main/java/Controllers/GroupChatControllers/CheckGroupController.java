package Controllers.GroupChatControllers;


import InputBoundary.GroupInputBoundary;
import Presenters.User.CheckGroupPresenter;
import UseCase.GroupManager;

public class CheckGroupController {

    private final GroupInputBoundary checkGroupInputBoundary = new GroupManager();

    public void checkGroup(String user, String group, CheckGroupPresenter presenter){
        checkGroupInputBoundary.runCheckGroup(user, group, presenter);
    }
}
