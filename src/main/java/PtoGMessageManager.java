package UseCase;

import Entity.Group;
import Entity.PtoGMessage;
import Entity.User;
import UseCases.UseCase;

import java.util.ArrayList;

public class PtoGMessageManager extends UseCase {


    /**
     * Sends a message from sender to a group
     * @param group the group that wants to receive a message.
     * @param message the message sent from sender to receiver
     */
    public void sendGroupMessage(Group group, PtoGMessage message){;
        group.addGroupMessage(message);
    }


    /**
     * Prints all messages from the group.
     * @param group the group that receive all messages from the members.
     */
    public void receiveMessageHistory(Group group){
        ArrayList<PtoGMessage> history = group.getMessage();
        for (PtoGMessage m: history){
            System.out.println(m);
        }
    }




    /**
     * @param sender the sender of a text.
     * @param group the group of receiver of a text.
     * @param text the text sent from sender to receiver
     * @return a message containing text sent from sender to a group.
     */
    public PtoGMessage createMessage(User sender, Group group, String text){
        return new PtoGMessage(sender, group, text);
    }
}