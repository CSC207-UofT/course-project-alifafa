package Entity.Message;

import Entity.Users.User;

import java.io.Serializable;

public class PtoPMessage extends Message implements Serializable {
    /**
     * A person-to-person message.
     */

    // === Instance Variables ===
    //The receiver of this message.
    private final User RECEIVER;

    /**
     * Creates a message.
     * @param sender the sender of this message.
     * @param receiver the receiver of this message.
     * @param content the content of this message.
     *
     */

    public PtoPMessage(User  sender, User  receiver, String content) {
        super(sender, content);
        this.RECEIVER = receiver;
    }


    /**
     * Converts message to a readable String
     *
     * @return return the string of message
     */
    @Override
    public String toString (){
        return SENDER.getUserName() + " -> " + RECEIVER.getUserName() +": " + CONTENT + "   (" + TIME + ")";
    }

    /**
     * @return Return the receiver of the message.
     */
    public User getReceiver() {
        return this.RECEIVER;
    }

    /**
     * @return Return the sender of the message.
     */
    public User getSender() {
        return super.getSender();
    }

    /**
     * @return Return the content of the message.
     */
    public String getContent() {
        return super.getContent();
    }
}
