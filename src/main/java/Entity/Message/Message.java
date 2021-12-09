package Entity.Message;

import Entity.Users.User;

import java.time.LocalDateTime;

public class Message {
    /**
     * A person-to-person message.
     */

    // === Instance Variables ===
    //The time this message created.
    final LocalDateTime TIME;
    //The content of this message.
    final String CONTENT;
    //The sender of this message.
    final User SENDER;

    /**
     * Creates a message.
     *
     * @param sender  the sender of this message.
     * @param content the content of this message.
     */

    public Message(User sender, String content) {
        this.SENDER = sender;
        this.CONTENT = content;
        this.TIME = LocalDateTime.now();
    }

    public String toString (){
        return CONTENT;
    }

    /**
     * @return Return the sender of the message.
     */
    public User getSender() {
        return this.SENDER;
    }

    /**
     * @return Return the content of the message.
     */
    public String getContent() {
        return this.CONTENT;
    }
}


