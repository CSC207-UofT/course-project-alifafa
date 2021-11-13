package UseCase;

import Entity.Group;
import Entity.PtoGMessage;
import Entity.User;
import InputBoundary.PtoGMessageInputBoundary;
import InputBoundary.PtoPMessageInputBoundary;
import OutputBoundary.PtoGMessageOutputBoundary;

import java.io.IOException;
import java.util.ArrayList;

public class PtoGMessageManager implements PtoGMessageInputBoundary {




    /**
     * @param sender the sender of a text.
     * @param group the group of receiver of a text.
     * @param text the text sent from sender to receiver
     * @return a message containing text sent from sender to a group.
     */
    public PtoGMessage createMessage(User sender, Group group, String text){
        return new PtoGMessage(sender, group, text);
    }

    @Override
    public void sendMessage(User sender, Group group, PtoGMessage message){
        group.addGroupMessage(message);
    }

    @Override
    public void receiveMessageHistory(User user, Group group, PtoGMessageOutputBoundary outputBoundary) {
        ArrayList<PtoGMessage> history = group.getMessage();
        for (PtoGMessage m: history){
            System.out.println(m);
        }
    }
}