package Controllers.ChatControllers;

import Entity.PtoGMessage;
import UseCase.PtoGMessageManager;
import Entity.User;
import UseCase.UserManager;
import Entity.Group;
import UseCase.GroupManager;

public class PtoGChatController extends ChatController {
    /**
     * This class is responsible for controlling messages between two users
     */

    private final PtoGMessageManager ptogMessageManager = new PtoGMessageManager();
    private final GroupManager groupManager = new GroupManager();
    private final UserManager userManager = new UserManager();

    public PtoGChatController(){
        super();
        this.userPrompt.add("My UserID");
        this.userPrompt.add("GroupID");
        this.userPrompt.add("Message");
    }


    /**
     * Shows previous chat history, sends message from one user to another user, then shows updated chat history
     * @param senderUserID sender's userID
     * @param GroupID GroupID that receives the message.
     * @param content the content of a message
     */
    public void runGroupChat(String senderUserID, String GroupID, String content){

        User sender = userManager.getUser(senderUserID);
        Group group = groupManager.getGroup(GroupID);
        PtoGMessage message = ptogMessageManager.createMessage(sender, group, content);

        String g = "Group:" + group.getGroupName();
        System.out.println(g);

        //print old message history between sender and receiver.
        System.out.println("Old chat history:");
        ptogMessageManager.receiveMessageHistory(group);

        //send the message from the sender to the receiver
        ptogMessageManager.sendGroupMessage(group, message);

        //print updated message history between sender and receiver.
        System.out.println("New chat history:");
        ptogMessageManager.receiveMessageHistory(group);
    }
}
