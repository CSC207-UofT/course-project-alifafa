package CommandControl;

import Controllers.UserControllers.AddFriendController;

public class AddFriendCommand extends Command {
    AddFriendController controller = new AddFriendController();

    /**
     * This method is used after the user types 'chat'.
     * It only validates if the user has the friend they want to chat with. If such friend does not
     * exist, it will prompt the user to re-enter their friend's name.
     * @param userInput An array containing user's input. In this case, it should be their friend's
     *                  username.
     */
    @Override
    public void run(String[] userInput) {
        controller.addFriend(userInput);
        System.out.println("The friend is successfully added!");
    }
}
