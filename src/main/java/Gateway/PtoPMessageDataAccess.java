package Gateway;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.PtoPMessage;
import Entity.User;

import java.util.ArrayList;

public class PtoPMessageDataAccess implements PtoPMessageDataAccessInterface {
    @Override
    public void updatePtoPMessageHistory(User sender, User receiver) {

    }

    @Override
    public ArrayList<PtoPMessage> returnPtoPHistory(User sender, User receiver) {
        return new ArrayList<PtoPMessage>();
    }
}
