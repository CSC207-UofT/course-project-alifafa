package CommandControl;

import Controllers.UserControllers.CreateGroupController;

public class CreateGroupCommand extends Command{

    CreateGroupController controller = new CreateGroupController();
    //CreateGroupController, which has a checkGroupID method that checks if
    //the group's desired ID is used. It also has a createAGroup, which can
    //use GroupManager to create a new Group.


    /**
     * This method is responsible for create an account.
     * @param userInput Ths user's input from keyboard, it has GroupID and GroupName.
     */
    @Override
    public void run(String[] userInput) {
        boolean existingID = controller.checkGroupID(userInput[0]);
        if(!existingID){
            System.out.println("This Group ID already exists. Please use another one.");
        } else {
            controller.CreateAGroup(userInput);
            System.out.println("Your Group is successfully created!");
        }
    }
}