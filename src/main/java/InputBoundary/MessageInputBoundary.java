package InputBoundary;

import Entity.PtoPMessage;
import Entity.User;

public interface MessageInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the PtoPMessageManager.
     * Controller knows nothing about the PtoPMessageManger but it can use InputBoundary instead.
     */


    /**
     * Sends a message from sender to receiver
     * @param sender the user who wants to send a message.
     * @param receiver the user who wants to receive a message.
     * @param message the message sent from sender to receiver
     */
    public void sendMessage(User sender, User receiver, PtoPMessage message);


    /**
     * Prints all messages between receiver and sender.
     * @param receiver the user who wants to receive all messages between receiver and sender.
     * @param sender the user who sends messages to the receiver.
     */
    public void receiveMessageHistory(User receiver, User sender);


    /**
     * Deletes a message in both sender and receiver's person-to-person message history.
     * @param sender the sender who has right to delete the message.
     * @param receiver the receiver of the message.
     * @param message the message sent from sender to receiver.
     */
    public void deleteMessage(User sender, User receiver, PtoPMessage message);

    /**
     * @param sender the sender of a text.
     * @param receiver the receiver of a text.
     * @param text the text sent from sender to receiver
     * @return a message containing text sent from sender to receiver.
     */
    public PtoPMessage createMessage(User sender, User receiver, String text);
}
