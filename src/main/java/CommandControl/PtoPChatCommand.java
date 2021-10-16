package CommandControl;

import Controllers.ChatControllers.PtoPChatController;

public class PtoPChatCommand extends Command{

    PtoPChatController controller = new PtoPChatController();
    //PtoPChatController has a runChat method which can show previous chat history,
    //send message from one user to another user, then show updated chat history when
    //the two users' id and message content are provided.

    @Override
    public void run (String[] userInput){}

}
