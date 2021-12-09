package Entity.Message;

import Entity.Users.User;

import java.io.Serializable;

public class PtoGMessage extends Message implements Serializable {
    /**
     * A person-to-group message.
     */

    // === Instance Variables ===
    //The group of receiver of this message.
    private final Group GROUP;


    /**
     * Creates a message.
     *
     * @param sender  the sender of this message.
     * @param group   the group that receives the message.
     * @param content the content of this message.
     */
    public PtoGMessage(User sender, Group group, String content) {
        super(sender, content);
        this.GROUP = group;
    }


//    /**
//     * Gets the time when this message is created.
//     *
//     * @return the time when this message is created.
//     */
////    public LocalDateTime getTime(){
//        return TIME;
//    }


    /**
     * Gets the content of this message.
     *
     * @return the content of this message.
     */
    public String getContent() {
        return super.getContent();
    }


    /**
     * Gets the sender of this message.
     *
     * @return the sender of this message.
     */
    public User getSender() {
        return super.getSender();
    }


    /**
     * Gets the group that receives this message.
     *
     * @return the group that receives this message.
     */
    public Group getGroup() {
        return GROUP;
    }

    @Override
    public String toString() {
        return SENDER.getUserName() + ": " + CONTENT + "   (" + TIME + ")";
    }
}