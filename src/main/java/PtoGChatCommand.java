package CommandControl;

import Controllers.ChatControllers.PtoGChatController;

public class PtoGChatCommand extends Command{

    PtoGChatController controller = new PtoGChatController();
    //PtoGChatController has a runChat method which can show previous chat history, group name,
    //send message from one user to a group, then show updated chat history when a message is sent.


    /**This method is responsible for sending message.
     * @param userInput Ths user's input from keyboard, it has SenderUserID, GroupID, messageContent.
     */
    @Override
    public void run (String[] userInput){
        controller.runGroupChat(userInput[0], userInput[1], userInput[2]);
    }

}
