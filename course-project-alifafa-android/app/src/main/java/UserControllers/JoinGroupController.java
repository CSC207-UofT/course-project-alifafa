package UserControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.JoinGroupPresenter;
import UseCase.GroupManager;


public class JoinGroupController{

    /**
     * The input boundary for the JoinGroup use case.
     */
    private final GroupInputBoundary JoinGroupInputBoundary = new GroupManager();

    /**
     * A new JoinGroupController for the use case defined by the InputBoundary.
     */
    public void joinGroup(String[] parameters, JoinGroupPresenter presenter){
        JoinGroupInputBoundary.runJoinGroup(parameters, presenter);
    }


}
