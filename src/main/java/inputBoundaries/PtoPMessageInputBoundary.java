package inputBoundaries;

import Entity.PtoPMessage;
import Entity.User;

public interface PtoPMessageInputBoundary {

    /**
     * @param sender the sender of a text.
     * @param receiver the receiver of a text.
     * @param text the text sent from sender to receiver
     * @return a message containing text sent from sender to receiver.
     */
    PtoPMessage createMessage(User sender, User receiver, String text);


    /**
     * Sends a message from sender to receiver
     * @param sender the user who wants to send a message.
     * @param receiver the user who wants to receive a message.
     * @param message the message sent from sender to receiver
     */

    void sendMessage(User sender, User receiver, PtoPMessage message);
}
