package InputBoundary;

import Entity.Message.Group;
import Entity.Message.PtoGMessage;
import Entity.Users.User;
import OutputBoundary.Message.PtoG.PtoGMessageOutputBoundary;

import java.io.IOException;


public interface PtoGMessageInputBoundary {

    /**
     * Creates a message
     *
     * @param sender the sender of a text.
     * @param group  the receiver of a text.
     * @param text   the text sent from sender to receiver
     * @return a message containing text sent from sender to receiver.
     */
    PtoGMessage createMessage(User sender, Group group, String text);


    /**
     * Sends a message from sender to receiver
     *
     * @param sender  the user who wants to send a message.
     * @param group   the user who wants to receive a message.
     * @param message the message sent from sender to receiver
     */

    void sendGroupMessage(User sender, Group group, PtoGMessage message) throws IOException;

    /**
     * Stores all messages between receiver and sender.
     *
     * @param group the group who wants to receive all messages between receiver and sender.
     * @param user  the user who sends messages to the receiver.
     */
    void GroupMessageHistory(User user, Group group, PtoGMessageOutputBoundary outputBoundary);
}