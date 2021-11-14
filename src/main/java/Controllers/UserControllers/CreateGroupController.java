package Controllers.UserControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.CreateGroupPresenter;
import UseCase.GroupManager;

/**
 * This class is responsible for managing the user input and calling associated GroupManager when the user
 * wants to create a group.
 */
public class CreateGroupController{
    /**
     * The input boundary for the CreateGroup use case.
     */
    private final GroupInputBoundary CreateGroupInputBoundary = new GroupManager();


    /*
      A new CreateGroupController for the use case defined by the CreateGroupInputBoundary.
      @param CreateGroupInputBoundary the input boundary for the 'create a group' use case
     */

    /**
     *
     * @param parameters The input from the user, which is an array that contains groupID and groupName.
     */
    public void createAGroup(String[] parameters, CreateGroupPresenter presenter) {
        CreateGroupInputBoundary.runCreateGroup(parameters, presenter);
    }
}
