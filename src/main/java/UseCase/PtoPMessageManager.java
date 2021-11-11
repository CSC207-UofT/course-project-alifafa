package UseCase;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.PtoPMessage;
import Entity.User;
import Gateway.PtoPMessageDataAccess;
import UseCases.UseCase;
import inputBoundaries.PtoPMessageInputBoundary;
import outputBoundaries.PtoPMessageOutputBoundary;

import java.util.ArrayList;

public class PtoPMessageManager extends UseCase implements PtoPMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    // ptoPMessageDataAccessInterface of this class, which is implemented by PtoPMessageDataAccess.It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface;

    public PtoPMessageManager(PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface){
        this.ptoPMessageDataAccessInterface = ptoPMessageDataAccessInterface;
    }

    @Override
    public  void sendMessage(User sender, User receiver, PtoPMessage message){
        sender.addMessage(receiver, message);
        receiver.addMessage(sender, message);

        ptoPMessageDataAccessInterface.updatePtoPMessageHistory(sender, receiver);
    }

    @Override
    public void receiveMessageHistory(User receiver, User sender, PtoPMessageOutputBoundary outputBoundary){
        ArrayList<PtoPMessage> history = ptoPMessageDataAccessInterface.returnPtoPHistory(sender, receiver);
        StringBuilder formattedHistory = new StringBuilder();
        for (PtoPMessage message: history){
            formattedHistory.append(message.toString()).append("\n");
        }
        outputBoundary.store(formattedHistory.toString());
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
