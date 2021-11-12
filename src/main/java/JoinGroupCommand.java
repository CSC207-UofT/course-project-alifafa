package CommandControl;

import Controllers.UserControllers.JoinGroupController;


public class JoinGroupCommand extends Command{

    JoinGroupController controller = new JoinGroupController();
    //JoinGroupController, which has a JoinGroup method that takes both user's id
    // and group's id, that can add a user to an existing group.


    /**
     * This method is responsible for create an account.
     * @param userInput Ths user's input from keyboard, it has User'sId and Group'sId.
     */
    @Override
    public void run(String[] userInput) {
        controller.JoinGroup(userInput);
        System.out.println("You have successfully joined this group!");
    }
}