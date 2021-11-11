package CommandControl;

import Controllers.ChatControllers.PtoPMessageController;

public class PtoPChatCommand extends Command{

    PtoPMessageController controller = new PtoPMessageController();
    //PtoPChatController has a runChat method which can show previous chat history,
    //send message from one user to another user, then show updated chat history when
    //the two users' id and message content are provided.


    /**This method is responsible for sending message.
     * @param userInput Ths user's input from keyboard, it has myUserID, friendUserID, messageContent.
     */
    @Override
    public void run (String[] userInput){
        controller.runChat(userInput[0], userInput[1], userInput[2]);
    }

}
