package main;

import java.time.LocalDateTime;

public class Message {
    /**
     * A message.
     */

    // === Instance Variables ===
    //The time this message created.
    private final LocalDateTime TIME;
    //The content of this message.
    private final String CONTENT;
    //The sender of this message.
    private final MessageStorable SENDER;
    //The receiver of this message.
    private final MessageStorable  RECEIVER;


    /**
     * Creates a message.
     * @param sender the sender of this message.
     * @param receiver the receiver of this message.
     * @param content the content of this message.
     *
     */
    public Message(MessageStorable  sender, MessageStorable  receiver, String content){
        this.SENDER = sender;
        this.RECEIVER = receiver;
        this.CONTENT = content;
        this.TIME = LocalDateTime.now();
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
    public MessageStorable  getSender(){
        return SENDER;
    }


    /**
     * Gets the receiver of this message.
     *
     * @return the receiver of this message.
     */
    public MessageStorable  getReceiver(){
        return RECEIVER;
    }

    public String toString (){
        return SENDER.getUserName() + ": " + CONTENT + "   (" + TIME + ")";
    }
}
