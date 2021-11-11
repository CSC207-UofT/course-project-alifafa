package DataAccessInterface;

import Entity.PtoPMessage;
import Entity.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public interface PtoPMessageDataAccessInterface {

    // save a user's chat history data to filepath.
    void saveToFile(String filepath, Object o) throws IOException;

    // convert data in filepath to a user's chat history data.
    public HashMap<User, ArrayList<PtoPMessage>> readFromFile(String filepath) throws IOException, ClassNotFoundException;


}
