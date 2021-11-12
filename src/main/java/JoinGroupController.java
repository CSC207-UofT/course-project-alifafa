package Controllers.UserControllers;

import UseCase.GroupManager;

public class JoinGroupController extends UserController {

    public JoinGroupController() {
        super(new GroupManager());
        this.userPrompt.add("Your ID");
        this.userPrompt.add("GroupID");
    }

    public void JoinGroup(String[] userInput){
        GroupManager manager = (GroupManager) this.useCase;
        manager.joinGroup(userInput[0], userInput[1]);
    }


}