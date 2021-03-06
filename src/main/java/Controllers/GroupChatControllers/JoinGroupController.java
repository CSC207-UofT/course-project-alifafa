package Controllers.GroupChatControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.Message.JoinGroupPresenter;
import UseCase.GroupManager;

import java.io.IOException;


public class JoinGroupController {

    /**
     * The input boundary for the JoinGroup use case.
     */
    private final GroupInputBoundary JoinGroupInputBoundary = new GroupManager();

    /**
     * A new JoinGroupController for the use case defined by the InputBoundary.
     */
    public void joinGroup(String[] parameters, JoinGroupPresenter presenter) throws IOException {
        JoinGroupInputBoundary.runJoinGroup(parameters, presenter);
    }


}
