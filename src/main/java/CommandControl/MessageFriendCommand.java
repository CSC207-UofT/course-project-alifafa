package CommandControl;

import Controllers.UserControllers.MessageFriendController;

public class MessageFriendCommand extends Command{
    MessageFriendController controller = new MessageFriendController();

    /**
     * This method is used after the user types 'chat'.
     * It only validates if the user has the friend they want to chat with. If such friend does not
     * exist, it will prompt the user to re-enter their friend's name.
     * @param userInput An array containing user's input. In this case, it should be their friend's
     *                  username.
     */
    @Override
    public void run(String[] userInput) {
        if(controller.checkFriend(userInput)){
            System.out.println("Please wait while we find your friend");
        } else {
            System.out.println("It seems like you don't have this contact. " +
                    "Please re-enter the information.");
        }
    }
}
