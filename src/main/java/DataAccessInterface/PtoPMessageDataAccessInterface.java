package DataAccessInterface;

import Entity.PtoPMessage;
import Entity.User;

import java.util.ArrayList;

public interface PtoPMessageDataAccessInterface {

    /**
     * Updates PtoPMessage history between the sender and the receiver.
     *
     * @param sender the sender of the message.
     * @param receiver the receiver of the message.
     */
    void updatePtoPMessageHistory(User sender, User receiver);

    /**
     * Returns all PtoPHistory between the sender and the receiver.
     * @param sender the sender of the message.
     * @param receiver the receiver of the message.
     * @return All PtoPHistory between the sender and the receiver
     */
    ArrayList<PtoPMessage> returnPtoPHistory(User sender, User receiver);


}
