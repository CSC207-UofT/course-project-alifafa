package Controllers.GroupChatControllers;


import InputBoundary.GroupInputBoundary;
import InputBoundary.UserInputBoundary;
import UseCase.GroupManager;
import UseCase.UserManager;

public class CheckGroupController {

    private final GroupInputBoundary checkGroupInputBoundary = new GroupManager();

    public void checkGroup(String user, String group, Presenters.CheckGroupPresenter presenter){
        checkGroupInputBoundary.runCheckGroup(user, group, presenter);
    }
}
