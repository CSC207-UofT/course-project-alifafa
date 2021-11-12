package Entity;

import java.time.LocalDateTime;

public class PtoGMessage {
    /**
     * A person-to-group message.
     */

    // === Instance Variables ===
    //The time this message created.
    private final LocalDateTime TIME;
    //The content of this message.
    private final String CONTENT;
    //The sender of this message.
    private final User SENDER;
    //The group of receiver of this message.
    private final Group GROUP;


    /**
     * Creates a message.
     * @param sender the sender of this message.
     * @param group the group that receives the message.
     * @param content the content of this message.
     *
     */
    public PtoGMessage(User  sender, Group group, String content){
        this.SENDER = sender;
        this.CONTENT = content;
        this.TIME = LocalDateTime.now();
        this.GROUP = group;
    }


    /**
     * Gets the time when this message is created.
     *
     * @return the time when this message is created.
     */
    public LocalDateTime getTime(){
        return TIME;
    }


    /**
     * Gets the content of this message.
     *
     * @return the content of this message.
     */
    public String getContent(){
        return CONTENT;
    }


    /**
     * Gets the sender of this message.
     *
     * @return the sender of this message.
     */
    public User getSender(){
        return SENDER;
    }


    /**
     * Gets the group that receives this message.
     *
     * @return the group that receives this message.
     */
    public Group getGroup(){
        return GROUP;
    }

    public String toString (){
        return SENDER.getUserName() + ": " + CONTENT + "   (" + TIME + ")";
    }
}