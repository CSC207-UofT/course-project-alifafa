package InputBoundary;

import Entity.PtoGMessage;
import Entity.User;
import Entity.Group;
import OutputBoundary.PtoGMessageOutputBoundary;


public interface PtoGMessageInputBoundary {

    /**
     * Creates a message
     * @param sender the sender of a text.
     * @param group the receiver of a text.
     * @param text the text sent from sender to receiver
     * @return a message containing text sent from sender to receiver.
     */
    PtoGMessage createMessage(User sender, Group group, String text);


    /**
     * Sends a message from sender to receiver
     * @param sender the user who wants to send a message.
     * @param group the user who wants to receive a message.
     * @param message the message sent from sender to receiver
     */

    void sendMessage(User sender, Group group, PtoGMessage message);

    /**
     * Stores all messages between receiver and sender.
     * @param group the group who wants to receive all messages between receiver and sender.
     * @param user the user who sends messages to the receiver.
     */
    void receiveMessageHistory(User user, Group group, PtoGMessageOutputBoundary outputBoundary);
}