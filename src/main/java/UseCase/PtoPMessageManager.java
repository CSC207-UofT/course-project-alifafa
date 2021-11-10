package UseCase;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.PtoPMessage;
import Entity.User;
import Gateway.PtoPMessageDataAccess;
import UseCases.UseCase;
import inputBoundaries.PtoPMessageInputBoundary;

import java.util.ArrayList;

public class PtoPMessageManager extends UseCase implements PtoPMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    private final PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface = new PtoPMessageDataAccess();

    @Override
    public  void sendMessage(User sender, User receiver, PtoPMessage message){
        sender.addMessage(receiver, message);
        receiver.addMessage(sender, message);
        ptoPMessageDataAccessInterface.updatePtoPMessageHistory(sender, receiver);
    }


    /**
     * Returns all messages between receiver and sender.
     * @param receiver the user who wants to receive all messages between receiver and sender.
     * @param sender the user who sends messages to the receiver.
     * @return all messages between receiver and sender.
     */
    public ArrayList<PtoPMessage> receiveMessageHistory(User receiver, User sender){
        return ptoPMessageDataAccessInterface.returnPtoPHistory(sender, receiver);
    }


//    /**
//     * Deletes a message in both sender and receiver's person-to-person message history.
//     * @param sender the sender who has right to delete the message.
//     * @param receiver the receiver of the message.
//     * @param message the message sent from sender to receiver.
//     */
//    public void deleteMessage(User sender, User receiver, PtoPMessage message){
//        sender.deleteMessage(receiver, message);
//        receiver.deleteMessage(sender, message);
//    }

    @Override
    public PtoPMessage createMessage(User sender, User receiver, String text){
        return new PtoPMessage(sender, receiver, text);
    }

}
