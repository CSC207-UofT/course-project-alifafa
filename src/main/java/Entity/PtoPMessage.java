package Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PtoPMessage implements Serializable {
    /**
     * A person-to-person message.
     */

    // === Instance Variables ===
    //The time this message created.
    private final LocalDateTime TIME;
    //The content of this message.
    private final String CONTENT;
    //The sender of this message.
    private final User SENDER;
    //The receiver of this message.
    private final User  RECEIVER;


    /**
     * Creates a message.
     * @param sender the sender of this message.
     * @param receiver the receiver of this message.
     * @param content the content of this message.
     *
     */
    public PtoPMessage(User  sender, User  receiver, String content){
        this.SENDER = sender;
        this.RECEIVER = receiver;
        this.CONTENT = content;
        this.TIME = LocalDateTime.now();
    }


    public String toString (){
        return SENDER.getUserName() + " -> " + RECEIVER.getUserName() +": " + CONTENT + "   (" + TIME + ")";
    }
}
