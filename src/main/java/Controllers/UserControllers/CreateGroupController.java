package Controllers.UserControllers;

import Entity.Group;
import UseCase.GroupManager;


/**
 * This class is responsible for managing the user input and calling associated GroupManager when the user
 * wants to create a group.
 */
public class CreateGroupController extends UserController {

    public CreateGroupController(){
        super(new GroupManager());
        this.userPrompt.add("GroupID");
        this.userPrompt.add("GroupName");
    }


    /**
     * Check if this ID already exists.
     * @param inputID The input from the user, which is a string contains userID.
     * @return return a boolean indicating whether the GroupID can be used.
     */
    public boolean checkGroupID(String inputID) {
        GroupManager manager = (GroupManager) this.useCase;
        return manager.checkGroupID(inputID);
    }


    /**
     *
     * @param parameters The input from the user, which is an array containing GroupID and GroupName.
     */
    public void CreateAGroup(String[] parameters){
        GroupManager manager = (GroupManager)this.useCase;
        Group newGroup = manager.createGroup(parameters[0], parameters[1]);
    }

}
